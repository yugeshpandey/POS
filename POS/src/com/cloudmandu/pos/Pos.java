package com.cloudmandu.pos;

import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.input.helper.InputHelper;
import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.printer.Printer;

public class Pos {

	public static void main(String[] args) {
		//Inventory stock - use HashMap 
		Inventory inventory = new Inventory();
		
		inventory.stockInventory();
		
		//Display Inventory - print
		Printer printer = new Printer();
		printer.displayInventory(inventory);
		
		//Select Item - Scanner , loop
		InputHelper inputHelper = new InputHelper();
		System.out.println("Type item number to add to your cart: ");
		int selectedItemId = inputHelper.getInteger();
		
		BaseItem selectedItem = printer.displayItem(inventory, selectedItemId);
		
				
		//Store items - ArrayList
		Cart shoppingCart = new Cart();
		shoppingCart.addToCart(selectedItem);
		
		//Calculate price
		//Print receipt
		

	}

}
