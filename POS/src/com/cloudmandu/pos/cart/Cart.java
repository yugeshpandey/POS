package com.cloudmandu.pos.cart;

import java.util.ArrayList;

import com.cloudmandu.pos.inventory.BaseItem;

public class Cart {
	
	private ArrayList<BaseItem> currentCart = new ArrayList<>();
	
	public void addToCart(BaseItem selectedItem) {
		currentCart.add(selectedItem);
	}
	
	public ArrayList<BaseItem> getCart() {
		return currentCart;
	}

}
