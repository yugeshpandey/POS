package com.cloudmandu.pos.inventory.beers;

import com.cloudmandu.pos.constants.Constants;
import com.cloudmandu.pos.inventory.Beer;

public class Corona extends Beer {

	@Override
	public String getName() {
		
		return Constants.CORONA;
	}

	@Override
	public double getPrice() {
		
		return Constants.CORONA_PRICE;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return Constants.CORONA_DISCOUNT;
	}

	@Override
	public boolean isInStock() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double alcoholContent() {
		// TODO Auto-generated method stub
		return Constants.CORONA_ALC_CONTENT;
	}

	@Override
	public double getSixPackPrice() {
		// TODO Auto-generated method stub
		return Constants.CORONA_PRICE;
	}

	@Override
	public double getTwelvePackPrice() {
		// TODO Auto-generated method stub
		return Constants.CORONA_PRICE * 1.8;
	}

	@Override
	public String toString() {
		return "Corona [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDiscount()=" + getDiscount()
				+ ", isInStock()=" + isInStock() + ", alcoholContent()=" + alcoholContent() + ", getSixPackPrice()="
				+ getSixPackPrice() + ", getTwelvePackPrice()=" + getTwelvePackPrice() + "]";
	}
	
	

}
