package com.cloudmandu.pos.input.helper;

import java.util.Scanner;



public class InputHelper {
	
	private final Scanner scanner;
	
	public InputHelper() {
		scanner = new Scanner(System.in);
	}
	
	public int selectItemByID(){
		int retVal = scanner.nextInt();
		scanner.nextLine();
		
		return retVal;
	
	}
	
	public String selectAny() {
		return scanner.nextLine();
	}
	
	public char selectOption() {
		return scanner.nextLine().charAt(0);
	}
	
	public void closeScanner() {
		scanner.close();
	}
	
	/*
	 * public Cart shoppingMain(Inventory inventory) { Cart shoppingCart = new
	 * Cart(); Printer printer = new Printer(); boolean finishShopping = false; int
	 * selectedItemId = 0;
	 * 
	 * do {
	 * 
	 * selectedItemId =
	 * getInteger("Type item number to add to your cart, type 0 to quit: ");
	 * 
	 * BaseItem selectedItem = inventory.getInventoryItem(inventory,
	 * selectedItemId);
	 * 
	 * if (selectedItemId != 0 && selectedItem != null) {
	 * 
	 * boolean isInStock = selectedItem.isInStock();
	 * 
	 * if (!isInStock) { System.out.println("Sorry, this item is out of stock"); }
	 * else { printer.displayItem(inventory, selectedItemId); char promptSelection =
	 * getCharacter("Type D to get discount, X to remove selected item," +
	 * " any other key to continue without discount: ");
	 * 
	 * switch (promptSelection) { case 'D': System.out.println("Discount added to "
	 * + selectedItem.getName()); shoppingCart.addToDiscountList(selectedItem);
	 * shoppingCart.addToCart(selectedItem); break; case 'X':
	 * System.out.println(selectedItem.getName() + " was removed from your cart.");
	 * shoppingCart.removeFromCart(selectedItem); break; default: // Store items -
	 * ArrayList shoppingCart.addToCart(selectedItem); break; } } } else if
	 * (!(selectedItem != null) && selectedItemId != 0) {
	 * 
	 * System.out.println("Item number not found");
	 * 
	 * } else {
	 * 
	 * System.out.println("Thank you for shopping."); finishShopping = true;
	 * 
	 * }
	 * 
	 * } while (!finishShopping);
	 * 
	 * return shoppingCart; }
	 */
	

}
