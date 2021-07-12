package com.cloudmandu.pos.processor;

import java.util.ArrayList;
import java.util.List;

import com.cloudmandu.pos.cart.Cart;
import com.cloudmandu.pos.inventory.BaseItem;
import com.cloudmandu.pos.inventory.Inventory;
import com.cloudmandu.pos.receipt.Receipt;

public class PosProcessor implements ProcessorIf{
	
	private final Inventory inventory;
	private final Cart cart;

	public PosProcessor(Inventory inventory) {
		this.inventory = inventory;
		this.cart = new Cart();
	}

	@Override
	public void process(char userInput) {
		
		
	}
	
	@Override
	public void process(int userInput) {
		BaseItem item = inventory.getInventoryItem(userInput);
		cart.addToCart(item);
	}

	@Override
	public List<Receipt> checkOut() {
	
		List<BaseItem> items = cart.getCart();
		List<Receipt> receipts = new ArrayList<>();
		
		for(BaseItem item : items) {
			Receipt receipt = new Receipt();
			receipt.setName(item.getName());
			receipt.setQuantity(1);
			receipt.setPrice(item.getPrice());
			receipt.setDiscount(item.getDiscount());
			receipt.setTax(item.getTax());
			receipt.setTotal((receipt.getQuantity() * receipt.getPrice() * (100 - ( item.getDiscount() * 100) * (100 - ( item.getTax() * 100)))) / 100 );
			
			receipts.add(receipt);
		}
		return receipts;
	}

	
}
