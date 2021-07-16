package com.cloudmandu.pos.printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cloudmandu.pos.calculator.Calculator;
import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.receipt.Receipt;

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
	
	public void displayItem(Inventory inventoryObject, int selectedItemId) {
		Map<Integer, BaseItem> inventory = inventoryObject.getInventory();
		
		BaseItem selectedItem = inventory.get(selectedItemId);
		System.out.println("The following item was added to your cart: ");
		System.out.printf("%20s" , "Name");
		System.out.printf("%10s" , "Price");
		System.out.println("");
		System.out.printf("%20s" , selectedItem.getName());
		System.out.printf("%10.2f" , selectedItem.getPrice());
		System.out.println();
						
		
	}

	public void printCartItems(Cart shoppingCart) {
		ArrayList<BaseItem> currentCart = shoppingCart.getCart();
		Calculator calculator = new Calculator();
		
		System.out.printf("%20s" , "Name");
		System.out.printf("%10s" , "Price");
		System.out.println("");
		
		for (int i = 0; i < currentCart.size(); i++) {
			BaseItem currentItem = currentCart.get(i);
			
			System.out.printf("%20s" , currentItem.getName());
			System.out.printf("%10.2f" , currentItem.getPrice());
			System.out.println();
		}
		
		double totalPrice = calculator.calculateTotalPrice(shoppingCart);
		System.out.printf("\n\tYour total price is: " + totalPrice);
		
	}
	
	public void printSimpleMessage(String message) {
		System.out.println(message);
	}

	public void printReceipt(List<Receipt> finalReceipt) {
		System.out.println(finalReceipt);
		
	}
	
	public void writeReceiptToFile(List<Receipt> finalReceipt) {
		
		
		try {
		      FileWriter myWriter = new FileWriter("filename.htm");
		      myWriter.write(finalReceipt.toString());
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
