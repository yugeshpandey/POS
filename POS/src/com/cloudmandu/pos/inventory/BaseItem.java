package com.cloudmandu.pos.inventory;

import com.cloudmandu.pos.constants.Constants;

public abstract class BaseItem {
	
	public abstract String getName();
	public abstract double getPrice();
	public abstract double getDiscount();
	public abstract boolean isInStock();
	public double getTax() {
		return Constants.TAX;
	}
	

}
