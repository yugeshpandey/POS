package com.cloudmandu.pos;

import com.cloudmandu.pos.inventory.Inventory;

public class Pos {

	public static void main(String[] args) {
		//Inventory stock - use HashMap 
		Inventory inventory = new Inventory();
		
		inventory.stockInventory();
		
		System.out.println(inventory.getInventory());
		//Display Inventory - print
		//Select Item - Scanner , loop
		//Store items - ArrayList
		//Calculate price
		//Print receipt
		

	}

}
