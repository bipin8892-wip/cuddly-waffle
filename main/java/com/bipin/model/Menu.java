package com.bipin.model;

import java.util.List;

public class Menu {
	
	private long id;
	private String type;
	private List<MenuItem> items;
	private Restaurant restaurant;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<MenuItem> getItems() {
		return items;
	}
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
	/*public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}*/
	public Menu(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	
	

}
