package com.cloudmandu.pos.inventory;

public abstract class BaseItem {
	
	public abstract String getName();
	public abstract double getPrice();
	public abstract double getDiscount();
	public abstract boolean isInStock();
	public abstract boolean giveDiscount();

}
