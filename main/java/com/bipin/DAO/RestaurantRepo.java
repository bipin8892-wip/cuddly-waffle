package com.bipin.DAO;

import java.util.ArrayList;
import java.util.List;

import com.bipin.model.Restaurant;

public class RestaurantRepo {

	List<Restaurant> restaurant;
	
	public RestaurantRepo()
	{
		restaurant= new ArrayList<>();
		
		Restaurant r1= new Restaurant();
		r1.setId(101);
		r1.setLocation("Marathalli");
		r1.setName("KFC");
		
		Restaurant r2= new Restaurant();
		r2.setId(102);
		r2.setLocation("Sarjapura");
		r2.setName("Punjabi King");
		
		Restaurant r3= new Restaurant();
		r3.setId(103);
		r3.setLocation("Kodathi");
		r3.setName("Birbal Darbar");
		
		Restaurant r4= new Restaurant();
		r4.setId(104);
		r4.setLocation("Whitefield");
		r4.setName("Tandooriwala");
		
		restaurant.add(r1);
		restaurant.add(r2);
		restaurant.add(r3);
		restaurant.add(r4);
		
	}
	public List<Restaurant> getRestaurant()
	{
		return restaurant;
	}
	
	public Restaurant getRestaurants(String name)
	{
		for(Restaurant a: restaurant)
		{
			if(a.getName()==name)
				return a;
		}
		
		return null;
	}
	public void createRestaurant(Restaurant r) {
		// TODO Auto-generated method stub
		restaurant.add(r);
		
	}
	
}
