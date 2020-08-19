package com.bipin.resources;


import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.DAO.RestaurantRepo;
import com.bipin.model.Restaurant;

//@Path("restaurant")
@RestController
public class RestaurantResource {
	RestaurantRepo repo= new RestaurantRepo();
	
	
	//@GET
	//@Produces(MediaType.APPLICATION_XML)
	@RequestMapping("restaurant")
	public List<Restaurant> getRestaurant()
	{
		System.out.println("getRestaurant called...");
		
		return repo.getRestaurant();
	}
	
	@POST
	@Path("createrestaurant")
	public Restaurant createRestaurant(Restaurant r)
	{
		repo.createRestaurant(r);
		
		return r;
	}

}
