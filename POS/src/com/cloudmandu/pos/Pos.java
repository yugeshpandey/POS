package com.cloudmandu.pos;

import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.printer.Printer;

public class Pos {

	public static void main(String[] args) {
		//Inventory stock - use HashMap 
		Inventory inventory = new Inventory();
		
		inventory.stockInventory();
		
		Printer printer = new Printer();
		printer.displayInventory(inventory);
		//Display Inventory - print
		//Select Item - Scanner , loop
		//Store items - ArrayList
		//Calculate price
		//Print receipt
		

	}

}
