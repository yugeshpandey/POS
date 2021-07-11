package com.cloudmandu.pos.input.helper;

import java.util.Scanner;

public class InputHelper {
	
	Scanner scanner = new Scanner(System.in);
		
	public int getInteger(String message) {
		System.out.println(message);
		return scanner.nextInt();
	}
	
	public char getCharacter(String message) {
		System.out.println(message);
		char responseToUppercase = Character.toUpperCase(scanner.next().charAt(0));
		return responseToUppercase;
	}
	

}
