package com.cloudmandu.pos;

//import com.cloudmandu.pos.calculator.Calculator;
import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.input.helper.InputHelper;
//import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.printer.Printer;

public class Pos {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Printer printer = new Printer();
		//Calculator calculator = new Calculator();
		InputHelper inputHelper = new InputHelper();

		// Inventory stock - use HashMap
		inventory.stockInventory();

		// Display Inventory - print
		printer.displayInventory(inventory);

		// Select Item - Scanner , loop
		Cart shoppingCart = inputHelper.shoppingMain(inventory);

		// Calculate price
		 
		InputHelper inputHelperPrompt = new InputHelper();
		char finalPrompt = inputHelperPrompt.getCharacter("Press Y to print receipt, X to continue shopping."); 
		
		switch(finalPrompt) {
		case 'Y':
			printer.printCartItems(shoppingCart);
			break;
		
		case 'X':
			inputHelper.shoppingMain(inventory);
			break;
		}
		
		// Print receipt

	}

}
