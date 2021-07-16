package com.cloudmandu.pos.processor;

import java.util.List;

import com.cloudmandu.pos.receipt.Receipt;

public interface ProcessorIf {
	
	public void process(char userInput);

	void process(int userInput);
	
	List<Receipt> checkOut();

}
