package com.demo.base;

public class C {

	public static void main(String[] args) {
		
		int num = 1234;
		int rem,sum=0;
		
		
		while(num>0) {
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		System.out.println(sum);

		String s = "abcbalfkvkfl";

		String s2 = s;

		StringBuffer sb = new StringBuffer();
//
//		char ch[] = s.toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {

			sb.append(s.charAt(i));

		}
		
		String s3 = sb.toString();
		
		System.out.println(sb);

		if (s.equals(s3)) {

			System.out.println("String is palindrome");
		}

		else {
			System.out.println("String is not palindrome");
		}

	}

}
