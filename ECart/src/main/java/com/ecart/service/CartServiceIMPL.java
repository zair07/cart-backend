package com.ecart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit ;

import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 
import com.ecart.dto.CartDTO;
import com.ecart.dto.MessageDTO;
import com.ecart.entity.CartEntity;
import com.ecart.repository.CartRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CartServiceIMPL implements CartService{
	
	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public List<CartDTO> getCart(){
		List<CartEntity> listCartEntity = new ArrayList<CartEntity>();
		List<CartDTO> listCartDTO = new ArrayList<CartDTO>();
		
		listCartEntity = cartRepository.findAll();
		for(int i=0; i < listCartEntity.size(); i++ ) 
		{
			listCartDTO.add(CartEntity.prepareCartDTO(listCartEntity.get(i)));
			try 
			{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			    Date oldTime = sdf.parse(listCartDTO.get(i).getTime());
			    Date currentTime = new Date();
			    long diffInMillies = Math.abs(currentTime.getTime() - oldTime.getTime());
			    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			    if(diff >= 7)
			    {
			    	MessageDTO messageDTO = deleteProduct(listCartDTO.get(i).getId());
			    	System.out.println( messageDTO.getId());
			    }
				
			} 
			catch (ParseException e) {
				e.printStackTrace();
			}  
		}
		return listCartDTO;
	}
	
	@Override
	public MessageDTO deleteProduct(String id) {
		cartRepository.deleteById(id);
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setId(id);
		return messageDTO;
	}
	
	@Override
	public MessageDTO modifyProductQuantity(String id, int value) {
		Optional<CartEntity> optionalEntity = cartRepository.findById(id);
		CartEntity cartEntity = optionalEntity.get();
		cartEntity.setQuantityNumber(cartEntity.getQuantityNumber()+value);
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setId(id);
		messageDTO.setQuantityNumber(cartEntity.getQuantityNumber()+value);
		cartRepository.save(cartEntity);
		return messageDTO;
	}
}