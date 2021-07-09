package com.cloudmandu.pos.cart;

import java.util.ArrayList;

import com.cloudmandu.pos.inventory.BaseItem;

public class Cart implements CartIf{
	
	private ArrayList<BaseItem> currentCart = new ArrayList<>();
	
	@Override
	public void addToCart(BaseItem selectedItem) {
		currentCart.add(selectedItem);
	}
	
	@Override
	public ArrayList<BaseItem> getCart() {
		return currentCart;
	}

	@Override
	public void removeFromCart(BaseItem selectedItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		
	}

}
