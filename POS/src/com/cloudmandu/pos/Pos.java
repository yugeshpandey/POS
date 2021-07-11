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

		// Inventory stock - use HashMap
		inventory.stockInventory();

		// Display Inventory - print
		printer.displayInventory(inventory);

		// Select Item - Scanner , loop
		boolean finishShopping = false;
		do {
			int selectedItemId = inputHelper.getInteger("Type item number to add to your cart, type 0 to quit: ");

			if (selectedItemId != 0) {
				BaseItem selectedItem = inventory.getInventoryItem(inventory, selectedItemId);
				boolean isInStock = selectedItem.isInStock();
				if (!isInStock) {
					System.out.println("Sorry, this item is out of stock");
				} else {
					printer.displayItem(inventory, selectedItemId);
					char promptSelection = inputHelper.getCharacter("Type D to get discount, X to remove selected item,"
							+ " any other key to continue without discount: ");
					switch (promptSelection) {
					case 'D':
						System.out.println("Discount added to " + selectedItem.getName());
						shoppingCart.addToDiscountList(selectedItem);
						shoppingCart.addToCart(selectedItem);
						break;
					case 'X':
						System.out.println(selectedItem.getName() + " was removed from your cart.");
						shoppingCart.removeFromCart(selectedItem);
						break;
					default:
						// Store items - ArrayList
						shoppingCart.addToCart(selectedItem);
						break;
					}

				}
			} else {
				System.out.println("Thank you for shopping.");
				finishShopping = true;
			}

		} while (!finishShopping);

		// Calculate price

		double totalPrice = calculator.calculateTotalPrice(shoppingCart);

		System.out.printf("Your total price is: " + totalPrice);
		// int discountedPrice = calculator.getDiscountedPrice(selectedItem);

		// Print receipt
		// printer.printReceipt(shoppingCart);

	}

}
