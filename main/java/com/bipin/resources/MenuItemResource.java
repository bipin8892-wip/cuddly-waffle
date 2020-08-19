package com.bipin.resources;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.DAO.MenuItemRepo;
import com.bipin.model.MenuItem;

@RestController
public class MenuItemResource {

MenuItemRepo repo= new MenuItemRepo();
	
	
	//@GET
	//@Produces(MediaType.APPLICATION_XML)
	@RequestMapping("menuitem")
	public List<MenuItem> getMenuItem()
	{
		System.out.println("getRestaurant called...");
		
		return repo.getMenuItem();
	}
	
	@POST
	@Path("addmenuitem")
	public MenuItem createMenuItem(MenuItem mi)
	{
		System.out.println(mi);
		repo.createMenuItem(mi);
		
		return mi;
	}
}
