package com.cloudmandu.pos.inventory;

import java.util.HashMap;
import java.util.Map;

import com.cloudmandu.pos.inventory.beers.Corona;
import com.cloudmandu.pos.inventory.beers.Heinekein;

public class Inventory {
	
	private Map<Integer, BaseItem> inventory = new HashMap<>();
	
	public void stockInventory() {
		inventory.put(100, new Heinekein());
		inventory.put(101, new Corona());
		
	}

	public Map<Integer, BaseItem> getInventory() {
		return inventory;
	}

	public void setInventory(Map<Integer, BaseItem> inventory) {
		this.inventory = inventory;
	}
	
	

}
