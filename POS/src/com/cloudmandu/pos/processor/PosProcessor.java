package com.cloudmandu.pos.processor;

import java.util.ArrayList;
import java.util.HashSet;
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

		// itemID name quantity price discount total
		List<BaseItem> items = cart.getCart();
		List<Receipt> receipts = new ArrayList<>();
		HashSet<BaseItem> itemSet = new HashSet<>();

		for (BaseItem item : items) {
			if (itemSet.add(item)) {
				Receipt receipt = new Receipt();
				int itemQuantity = findItemQuantity(items, item);

				receipt.setName(item.getName());
				receipt.setQuantity(itemQuantity);
				receipt.setPrice(item.getPrice());
				receipt.setDiscount(item.getDiscount());
				receipt.setTax(item.getTax());
//				receipt.setTotal(receipt.getQuantity() * receipt.getPrice()
//						* (100 - (item.getDiscount() * 100) * (100 - (item.getTax() * 100))));
				receipt.setTotal((receipt.getQuantity()
						* (receipt.getPrice() - (receipt.getPrice() * receipt.getDiscount() / 100))
						* (1 + receipt.getTax() / 100)));

				receipts.add(receipt);
			}
		}
		return receipts;
	}
	
	public int findItemQuantity(List<BaseItem> items, BaseItem currentItem) {
		int itemCount = 0;

		for (BaseItem item : items) {
			if (currentItem.equals(item)) {
				itemCount += 1;
			}
		}

		return itemCount;

	}
	

	
}
