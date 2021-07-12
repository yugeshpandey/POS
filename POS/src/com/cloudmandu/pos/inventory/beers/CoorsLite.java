package com.cloudmandu.pos.inventory.beers;

import com.cloudmandu.pos.constants.Constants;
import com.cloudmandu.pos.inventory.Beer;

public class CoorsLite extends Beer{

	@Override
	public String getName() {
		
		return Constants.COORSLITE;
	}

	@Override
	public double getPrice() {
		
		return Constants.COORSLITE_PRICE;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return Constants.COORSLITE_DISCOUNT;
	}

	@Override
	public boolean isInStock() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double alcoholContent() {
		// TODO Auto-generated method stub
		return Constants.COORSLITE_ALC_CONTENT;
	}

	@Override
	public double getSixPackPrice() {
		// TODO Auto-generated method stub
		return Constants.COORSLITE_PRICE;
	}

	@Override
	public double getTwelvePackPrice() {
		// TODO Auto-generated method stub
		return Constants.COORSLITE_PRICE * 1.8;
	}

	@Override
	public String toString() {
		return "CoorsLite [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDiscount()=" + getDiscount()
				+ ", isInStock()=" + isInStock() + ", alcoholContent()=" + alcoholContent() + ", getSixPackPrice()="
				+ getSixPackPrice() + ", getTwelvePackPrice()=" + getTwelvePackPrice() + "]";
	}

	

}
