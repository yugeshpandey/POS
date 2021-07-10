package com.cloudmandu.pos.inventory.lottery;

import com.cloudmandu.pos.constants.Constants;
import com.cloudmandu.pos.inventory.Lottery;

public class Megamillion extends Lottery {

	@Override
	public String getName() {
		
		// TODO Auto-generated method stub
		return Constants.MEGAMILLION;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return Constants.MEGAMILLION_PRICE;
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
	public boolean giveDiscount() {
		// TODO Auto-generated method stub
		return false;
	}

}
