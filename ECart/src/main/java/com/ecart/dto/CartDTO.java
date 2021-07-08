package com.ecart.dto;

import javax.validation.constraints.NotNull;
import com.ecart.entity.CartEntity;
import javax.validation.constraints.Max;

public class CartDTO {
	
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
	
	@NotNull
	private float discount;
	
	@NotNull
	private float delivery;
	
	@NotNull
	private String time;
	
	@NotNull
	@Max(4)
	private int quantityNumber;
	
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
	public float getDelivery() {
		return delivery;
	}
	public void setDelivery(float delivery) {
		this.delivery = delivery;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQuantityNumber() {
		return quantityNumber;
	}
	public void setQuantityNumber(int quantityNumber) {
		this.quantityNumber = quantityNumber;
	}
	
	@Override
	public String toString() {
		return "CartDTo [id=" + id + ", imgUrl=" + imgUrl + ", name=" + name + ", seller=" + seller + ", quantity="
				+ quantity + ", price=" + price + ", discount=" + discount + ", delivery=" + delivery + ", time=" + time
				+ ", quantityNumber=" + quantityNumber + "]";
	}
	
	public static CartEntity prepareCartEntity(CartDTO cartDTO)
	{
		CartEntity cartEntity = new CartEntity();
		cartEntity.setId(cartDTO.getId());
		cartEntity.setImgUrl(cartDTO.getImgUrl());
		cartEntity.setName(cartDTO.getName());
		cartEntity.setSeller(cartDTO.getSeller());
		cartEntity.setQuantity(cartDTO.getQuantity());
		cartEntity.setPrice(cartDTO.getPrice());
		cartEntity.setDiscount(cartDTO.getDiscount());
		cartEntity.setDelivery(cartDTO.getDelivery());
		cartEntity.setTime(cartDTO.getTime());
		cartEntity.setQuantityNumber(cartDTO.getQuantityNumber());
		
		return cartEntity;
		
	}
}
