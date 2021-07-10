package com.cloudmandu.pos.inventory.beers;

import com.cloudmandu.pos.constants.Constants;
import com.cloudmandu.pos.inventory.Beer;

public class Heinekein extends Beer{

	@Override
	public String getName() {
		
		return Constants.HEINEKEIN;
	}

	@Override
	public double getPrice() {
		
		return Constants.HEINEKEIN_PRICE;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isInStock() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double alcoholContent() {
		// TODO Auto-generated method stub
		return Constants.HEINEKEIN_ALC_CONTENT;
	}

	@Override
	public double getSixPackPrice() {
		// TODO Auto-generated method stub
		return Constants.HEINEKEIN_PRICE;
	}

	@Override
	public double getTwelvePackPrice() {
		// TODO Auto-generated method stub
		return Constants.HEINEKEIN_PRICE * 1.8;
	}

	@Override
	public String toString() {
		return "Heinekein [getName()=" + getName() + ", getPrice()=" + getPrice() + ", getDiscount()=" + getDiscount()
				+ ", isInStock()=" + isInStock() + ", alcoholContent()=" + alcoholContent() + ", getSixPackPrice()="
				+ getSixPackPrice() + ", getTwelvePackPrice()=" + getTwelvePackPrice() + "]";
	}

	@Override
	public boolean giveDiscount() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
