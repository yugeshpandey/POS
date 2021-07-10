package com.cloudmandu.pos.calculator;

import java.util.ArrayList;

import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.inventory.BaseItem;

public class Calculator {
	
	public double calculateTotalPrice(Cart shoppingCart) {
		ArrayList<BaseItem> cartItems = shoppingCart.getCart();
		double totalPrice = 0;
		
		for(int i = 0; i < cartItems.size(); i++) {
			BaseItem currentItem = cartItems.get(i);
			totalPrice += currentItem.getPrice();
		}
		
		totalPrice = (double) Math.round(totalPrice * 100) / 100;
		return totalPrice;
	}
	
	public double calculateDiscountedPrice(BaseItem discountedItem) {
		double discount = discountedItem.getDiscount();
		double originalPrice = discountedItem.getPrice();
		
		double discountedPrice = originalPrice - ( (discount / 100) * originalPrice);
		
		return discountedPrice;
	}

}
