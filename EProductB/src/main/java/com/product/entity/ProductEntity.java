package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.product.dto.ProductDTO;


@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	private String id;
	private String imgUrl;
	private String name;
	private String seller;
	private int quantity;
	private float price;
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
	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", imgUrl=" + imgUrl + ", name=" + name + ", seller=" + seller
				+ ", quantity=" + quantity + ", price=" + price + ", discount=" + discount + "]";
	}
	
	public static ProductDTO prepareRevenueDTO(ProductEntity cartEntity)
	{
		ProductDTO productDTO = new ProductDTO();
		productDTO.setId(cartEntity.getId());
		productDTO.setImgUrl(cartEntity.getImgUrl());
		productDTO.setName(cartEntity.getName());
		productDTO.setSeller(cartEntity.getSeller());
		productDTO.setQuantity(cartEntity.getQuantity());
		productDTO.setPrice(cartEntity.getPrice());
		productDTO.setDiscount(cartEntity.getDiscount());
		
		return productDTO;
		
	}
}
