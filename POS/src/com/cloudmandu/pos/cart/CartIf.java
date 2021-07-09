package com.cloudmandu.pos.cart;

import java.util.ArrayList;

import com.cloudmandu.pos.inventory.BaseItem;

public interface CartIf {

	void addToCart(BaseItem selectedItem);
	
	void removeFromCart(BaseItem selectedItem);
	
	void checkout();

	ArrayList<BaseItem> getCart();

}
