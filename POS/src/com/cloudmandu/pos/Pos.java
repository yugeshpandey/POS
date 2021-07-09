package com.cloudmandu.pos;

import com.cloudmandu.pos.calculator.Calculator;
import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.input.helper.InputHelper;
import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.printer.Printer;

public class Pos {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Printer printer = new Printer();
		Cart shoppingCart = new Cart();
		Calculator calculator = new Calculator();
		InputHelper inputHelper = new InputHelper();
		
		//Inventory stock - use HashMap 
		inventory.stockInventory();
		
		//Display Inventory - print
		printer.displayInventory(inventory);
		
		//Select Item - Scanner , loop
		for (int i = 0; i <=2; i++) {
			System.out.println("Type item number to add to your cart: ");
			int selectedItemId = inputHelper.getInteger();
			
			//Store items - ArrayList
			BaseItem selectedItem = printer.displayItem(inventory, selectedItemId);
			shoppingCart.addToCart(selectedItem);
		}
				
		//Calculate price
		
		double totalPrice = calculator.calculateTotalPrice(shoppingCart);
		double totalPriceTwoDecimals = (double) Math.round(totalPrice * 100) / 100;
		
		System.out.printf ("Your total price is: " + totalPriceTwoDecimals);
		//int discountedPrice = calculator.getDiscountedPrice(selectedItem);
		
		//Print receipt
		//printer.printReceipt(shoppingCart);

	}

}
