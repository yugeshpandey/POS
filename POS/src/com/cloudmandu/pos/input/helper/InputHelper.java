package com.cloudmandu.pos.input.helper;

import java.util.Scanner;

public class InputHelper {
	
	Scanner scanner = new Scanner(System.in);
		
	public int getInteger(String message) {
		System.out.println(message);
		return scanner.nextInt();
	}
	

}
