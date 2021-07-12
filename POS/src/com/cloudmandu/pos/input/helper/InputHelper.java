package com.cloudmandu.pos.input.helper;

import java.util.Scanner;

import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.printer.Printer;

public class InputHelper {
	
	Scanner scanner = new Scanner(System.in);
	
	public int getInteger(String message){
		System.out.println(message);
		if(scanner.hasNextInt()) {
			return scanner.nextInt();
		} else {
			System.out.println("Not a valid integer.");
			return 0;
		}
	}
	
	public char getCharacter(String message) {
		System.out.println(message);
		char responseToUppercase = Character.toUpperCase(scanner.next().charAt(0));
		return responseToUppercase;
	}
	
	public Cart shoppingMain(Inventory inventory) {
		Cart shoppingCart = new Cart();
		Printer printer = new Printer();
		boolean finishShopping = false;
		int selectedItemId = 0;

		do {

			selectedItemId = getInteger("Type item number to add to your cart, type 0 to quit: ");

			BaseItem selectedItem = inventory.getInventoryItem(inventory, selectedItemId);

			if (selectedItemId != 0 && selectedItem != null) {

				boolean isInStock = selectedItem.isInStock();

				if (!isInStock) {
					System.out.println("Sorry, this item is out of stock");
				} else {
					printer.displayItem(inventory, selectedItemId);
					char promptSelection = getCharacter("Type D to get discount, X to remove selected item,"
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
			} else if (!(selectedItem != null) && selectedItemId != 0) {

				System.out.println("Item number not found");

			} else {

				System.out.println("Thank you for shopping.");
				finishShopping = true;

			}

		} while (!finishShopping);

		return shoppingCart;
	}
	

}
