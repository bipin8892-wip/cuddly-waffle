package com.bipin.DAO;

import java.util.ArrayList;
import java.util.List;

import com.bipin.model.MenuItem;

public class MenuItemRepo {
	
	List<MenuItem> menuItem;
	
	public MenuItemRepo()
	{
		menuItem= new ArrayList<>();
		
		MenuItem mi1= new MenuItem();
		mi1.setId(101);
		mi1.setName("Chicken");
		mi1.setPrice(150.0);
		
		MenuItem mi2= new MenuItem();
		mi2.setId(102);
		mi2.setName("Rice");
		mi2.setPrice(60.0);
		
		MenuItem mi3= new MenuItem();
		mi3.setId(103);
		mi3.setName("Chicken");
		mi3.setPrice(200.0);
		
		MenuItem mi4= new MenuItem();
		mi4.setId(104);
		mi4.setName("Veg Kadhai");
		mi4.setPrice(150.0);
		
		menuItem.add(mi1);
		menuItem.add(mi2);
		menuItem.add(mi3);
		menuItem.add(mi4);
		
	}
	

	public List<MenuItem> getMenuItem()
	{
		return menuItem;
	}


	public void createMenuItem(MenuItem mi) {
		// TODO Auto-generated method stub
		menuItem.add(mi);
	}

}
