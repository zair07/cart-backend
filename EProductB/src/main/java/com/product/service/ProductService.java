package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.dto.ProductDTO;

@Service
public interface ProductService {
	
	public List<ProductDTO> getAllProducts();
	

}
