package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dto.ProductDTO;
import com.product.entity.ProductEntity;
import com.product.repo.ProductRepo;



@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	public List<ProductDTO> getAllProducts() {
        List<ProductEntity> entities =  productRepo.findAll();
        List<ProductDTO> result = new ArrayList<>();
        for(ProductEntity entity: entities) {
        	result.add(ProductEntity.prepareRevenueDTO(entity));
        }
        return result;
    }
	
	
}
