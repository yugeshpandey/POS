package com.cloudmandu.pos.calculator;

import java.util.ArrayList;

import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.inventory.BaseItem;

public class Calculator {
	
	public double getTotalPrice(Cart shoppingCart) {
		ArrayList<BaseItem> cartItems = shoppingCart.getCart();
		double totalPrice = 0;
		
		for(int i = 0; i < cartItems.size(); i++) {
			BaseItem currentItem = cartItems.get(i);
			totalPrice += currentItem.getPrice();
		}
		
		return totalPrice;
	}

}