package com.bipin.DAO;

import java.util.ArrayList;
import java.util.List;

import com.bipin.model.Menu;
import com.bipin.model.Restaurant;

public class MenuRepo {
	List<Menu> menu;
	Restaurant res=new Restaurant();
	
	public MenuRepo()
	{
		menu= new ArrayList<>();
		Menu m1= new Menu(res);
		m1.setId(101);
		m1.setItems(null);
		//m1.setRestaurant(res);
		m1.setType("Veg");
		
		Menu m2= new Menu(res);
		m2.setId(101);
		m2.setItems(null);
		//m2.setRestaurant(null);
		m2.setType("Non-Veg");
		
		Menu m3= new Menu(res);
		m3.setId(101);
		m3.setItems(null);
		//m3.setRestaurant(null);
		m3.setType("Non-Veg");
		
		Menu m4= new Menu(res);
		m4.setId(101);
		m4.setItems(null);
		//m4.setRestaurant(null);
		m4.setType("Non-Veg");
		
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		menu.add(m4);
	}
	
	public List<Menu> getMenu()
	{
		return menu;
	}

	public void createMenu(Menu m) {
		// TODO Auto-generated method stub
		menu.add(m);
		
	}

}
