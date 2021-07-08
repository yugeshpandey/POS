package com.cloudmandu.pos.inventory;

import java.util.HashMap;
import java.util.Map;

import com.cloudmandu.pos.inventory.beers.Corona;
import com.cloudmandu.pos.inventory.beers.Guinness;
import com.cloudmandu.pos.inventory.beers.Heinekein;
import com.cloudmandu.pos.inventory.lottery.Megamillion;
import com.cloudmandu.pos.inventory.lottery.Powerball;

public class Inventory {
	
	private Map<Integer, BaseItem> inventory = new HashMap<>();
	
	public void stockInventory() {
		inventory.put(100, new Heinekein());
		inventory.put(101, new Corona());
		inventory.put(102, new Guinness());
		inventory.put(103, new Corona());
		inventory.put(104, new Corona());
				
		inventory.put(200, new Powerball());
		inventory.put(201, new Megamillion());
		
	}

	public Map<Integer, BaseItem> getInventory() {
		return inventory;
	}

	public void setInventory(Map<Integer, BaseItem> inventory) {
		this.inventory = inventory;
	}
	
	

}
