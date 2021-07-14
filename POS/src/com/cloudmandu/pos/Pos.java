package com.cloudmandu.pos;

import java.util.List;

import com.cloudmandu.pos.constants.Constants;
import com.cloudmandu.pos.input.helper.InputHelper;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.printer.Printer;
import com.cloudmandu.pos.processor.PosProcessor;
import com.cloudmandu.pos.receipt.Receipt;

public class Pos {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Printer printer = new Printer();
		// Calculator calculator = new Calculator();
		InputHelper inputHelper = new InputHelper();
		PosProcessor processor = new PosProcessor(inventory);

		// Inventory stock - use HashMap
		inventory.stockInventory();

		// Display Inventory - print
		printer.displayInventory(inventory);

		// Select Item - Scanner , loop
		boolean checkOut = false;
		while (checkOut == false) {
			printer.printSimpleMessage(Constants.ITEM_SELECT_PROMPT);
			int selectedItemID = inputHelper.selectItemByID();
			printer.printSimpleMessage(Constants.ITEM_QUANTITY_PROMPT);
			int itemQuantity = inputHelper.selectItemQuantity();
			
			for (int i = 0; i < itemQuantity; i++) {
				processor.process(selectedItemID);
			}
						
			
			printer.printSimpleMessage(Constants.ITEM_SELECTED_PROMPT);
			printer.printSimpleMessage(Constants.CHECKOUT_PROMPT);

			char userInput = inputHelper.selectOption();

			if (userInput == 'c' || userInput == 'C') {
				checkOut = true;
			}
		}

		List<Receipt> finalReceipt = processor.checkOut();

		printer.printReceipt(finalReceipt);

		// Calculate price

		/*
		 * InputHelper inputHelperPrompt = new InputHelper(); char finalPrompt =
		 * inputHelperPrompt.
		 * getCharacter("Press Y to print receipt, X to continue shopping.");
		 * 
		 * switch(finalPrompt) { case 'Y': printer.printCartItems(shoppingCart); break;
		 * 
		 * case 'X': inputHelper.shoppingMain(inventory); break; }
		 */

		// Print receipt

	}

}
