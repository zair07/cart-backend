package com.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.service.CartService;
import com.ecart.dto.CartDTO;
import com.ecart.dto.MessageDTO;


@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@CrossOrigin(origins = "*")
	@GetMapping(value = "")
	public ResponseEntity<List<CartDTO>> getCart(){
		try 
		{
			List<CartDTO> list = cartService.getCart();
			if (list.isEmpty() || list.size() == 0)
			{
				return new ResponseEntity<List<CartDTO>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<List<CartDTO>>(list, HttpStatus.OK);
		} 
		catch (Exception e)
		{
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@CrossOrigin(origins = "*")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<MessageDTO> deleteProduct(@PathVariable(value = "id") String id){
		try
		{
			return new ResponseEntity<MessageDTO>(cartService.deleteProduct(id), HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@CrossOrigin(origins = "*")
	@Modifying(clearAutomatically = true)
	@PutMapping(value = "/modify/{id}/{value}")
	public ResponseEntity<MessageDTO> modifyProductQuantity(@PathVariable("id") String id,@PathVariable("value")int value) {
		try
		{
			return new ResponseEntity<MessageDTO>(cartService.modifyProductQuantity(id, value), HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
