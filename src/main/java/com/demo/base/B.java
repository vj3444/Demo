package com.demo.base;

public class B {

	public static void main(String[] args) {

		Integer sum = 0;

		String s = "geeksfoAAA258rg689eeks$#$%12345678";
		
		

		char ch[] = s.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {
				
				sb.append(ch[i]);
			}
		}
		
		for (char c : ch) {
			if (Character.isDigit(c)) {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
		
		String s2 = sb.toString();
		for(int i = 0;i<s2.length();i++) {
			
//			sum = sum+Integer.valueOf(Character.toString(ch[i]));
			
			sum = sum+Integer.parseInt(Character.toString(s2.charAt(i)));
						
			
		}
//		}
//		if (sb.length() > 0) {
//			sum += Integer.parseInt(sb.toString());
//
//			System.out.println(sum);
//		}
		System.out.println(sum);
		
	}
}
