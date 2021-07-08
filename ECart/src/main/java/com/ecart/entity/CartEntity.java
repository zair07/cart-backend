package com.ecart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ecart.dto.CartDTO;

@Entity
@Table(name="cart")
public class CartEntity {

	@Id
	private String id;
	private String imgUrl;
	private String name;
	private String seller;
	private int quantity;
	private float price;
	private float discount;
	private float delivery;
	private String time;
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
		return "CartEntity [id=" + id + ", imgUrl=" + imgUrl + ", name=" + name + ", seller=" + seller + ", quantity="
				+ quantity + ", price=" + price + ", discount=" + discount + ", delivery=" + delivery + ", time=" + time
				+ ", quantityNumber=" + quantityNumber + "]";
	}
	
	public static CartDTO prepareCartDTO(CartEntity cartEntity)
	{
		CartDTO cartDTO = new CartDTO();
		cartDTO.setId(cartEntity.getId());
		cartDTO.setImgUrl(cartEntity.getImgUrl());
		cartDTO.setName(cartEntity.getName());
		cartDTO.setSeller(cartEntity.getSeller());
		cartDTO.setQuantity(cartEntity.getQuantity());
		cartDTO.setPrice(cartEntity.getPrice());
		cartDTO.setDiscount(cartEntity.getDiscount());
		cartDTO.setDelivery(cartEntity.getDelivery());
		cartDTO.setTime(cartEntity.getTime());
		cartDTO.setQuantityNumber(cartEntity.getQuantityNumber());
		
		return cartDTO;
		
	}
	
}
