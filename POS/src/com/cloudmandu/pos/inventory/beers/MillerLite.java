package com.cloudmandu.pos.inventory.beers;

import com.cloudmandu.pos.constants.Constants;
import com.cloudmandu.pos.inventory.Beer;

public class MillerLite extends Beer{
	
	@Override
	public String getName() {
		
		return Constants.MILLERLITE;
	}

	@Override
	public double getPrice() {
		
		return Constants.MILLERLITE_PRICE;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return Constants.MILLERLITE_DISCOUNT;
	}

	@Override
	public boolean isInStock() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double alcoholContent() {
		// TODO Auto-generated method stub
		return Constants.MILLERLITE_ALC_CONTENT;
	}

	@Override
	public double getSixPackPrice() {
		// TODO Auto-generated method stub
		return Constants.MILLERLITE_PRICE;
	}

	@Override
	public double getTwelvePackPrice() {
		// TODO Auto-generated method stub
		return Constants.MILLERLITE_PRICE * 1.8;
	}

	@Override
	public String toString() {
		return "MillerLite [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDiscount()=" + getDiscount()
				+ ", isInStock()=" + isInStock() + ", alcoholContent()=" + alcoholContent() + ", getSixPackPrice()="
				+ getSixPackPrice() + ", getTwelvePackPrice()=" + getTwelvePackPrice() + "]";
	}

}
