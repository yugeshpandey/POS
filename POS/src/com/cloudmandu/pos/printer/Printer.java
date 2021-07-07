package com.cloudmandu.pos.printer;

import java.util.Map;
import java.util.Set;

import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;

public class Printer {
	public void displayInventory(Inventory inventoryObject) {
		
		Map<Integer, BaseItem> _inventory = inventoryObject.getInventory();	
		
		Set<Integer> keys = _inventory.keySet();
		
		System.out.printf( "%9s" , "ID");
		
		System.out.printf("%20s" , "Name");
		System.out.printf("%10s" , "Price");
		System.out.printf("%10s", "Discount");
		
		System.out.printf("%10s" ,"InStock");
		System.out.println("\n");
		
		for (Integer key: keys) {
			System.out.printf( "%9d" , key);
			BaseItem item = _inventory.get(key);
			System.out.printf("%20s" , item.getName());
			System.out.printf("%10.2f" , item.getPrice());
			System.out.printf("%10.2f", item.getDiscount());
			
			System.out.printf("%10s" , item.isInStock());
			System.out.println();
		}
	}

}
