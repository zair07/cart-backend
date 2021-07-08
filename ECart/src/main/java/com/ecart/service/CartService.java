package com.ecart.service;

import java.util.List;
import com.ecart.dto.CartDTO;
import com.ecart.dto.MessageDTO;

public interface CartService {
	public List<CartDTO> getCart();
	public MessageDTO deleteProduct(String id);
	public MessageDTO modifyProductQuantity(String id,int value);
}
