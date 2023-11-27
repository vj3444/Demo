package com.demo.base;

import java.util.ArrayList;

public class D {
	
	public static void main(String[] args) {
		
		String s = "Automation";
		
		char ch[] = s.toCharArray();
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		for (char character : ch) {
			list.add(character);
		}
		
		System.out.println(list);
		
		for(int i = 0;i<list.size();i++) {
			
		}
	}
	
	

}
