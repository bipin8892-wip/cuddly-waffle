package com.bipin.resources;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bipin.DAO.MenuRepo;
import com.bipin.model.Menu;

@RestController
public class MenuResource {
	
MenuRepo repo= new MenuRepo();
	
	
	//@GET
	//@Produces(MediaType.APPLICATION_XML)
	@RequestMapping("menu")
	public List<Menu> getMenu()
	{
		System.out.println("getRestaurant called...");
		
		return repo.getMenu();
	}
	
	@POST
	@Path("addmenu")
	public Menu createMenu(Menu m)
	{
		repo.createMenu(m);
		
		return m;
	}

}
