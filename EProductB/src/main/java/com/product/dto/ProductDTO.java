package com.product.dto;

import javax.validation.constraints.NotNull;


import com.product.entity.ProductEntity;

public class ProductDTO {
	@NotNull
	private String id;
	
	@NotNull
	private String imgUrl;
	
	@NotNull
	private String name;
	
	@NotNull
	private String seller;
	
	@NotNull
	private int quantity;
	
	@NotNull
	private float price;
	
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", imgUrl=" + imgUrl + ", name=" + name + ", seller=" + seller + ", quantity="
				+ quantity + ", price=" + price + ", discount=" + discount + "]";
	}

	@NotNull
	private float discount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public static ProductEntity prepareRevenueEntity(ProductDTO productDTO)
	{
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(productDTO.getId());
		productEntity.setImgUrl(productDTO.getImgUrl());
		productEntity.setName(productDTO.getName());
		productEntity.setSeller(productDTO.getSeller());
		productEntity.setQuantity(productDTO.getQuantity());
		productEntity.setPrice(productDTO.getPrice());
		productEntity.setDiscount(productDTO.getDiscount());
		
		return productEntity;
		
	}
}
