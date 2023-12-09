package com.demo.base;

import java.util.ArrayList;

public class D {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		Object[] arr = list.toArray();

		int sum = 0;

		int n = 6;

		int j = (n + 1) * (n + 2) / 2;

		int k = 1 + 2 + 3 + 4 + 5 + 6;

		System.out.println(j);
		System.out.println(k);

		for (int i = 0; i < arr.length; i++) {

//			sum = sum + arr[i];
		}

		int number = k - sum;

		System.out.println("Missing number" + number);

	}

}
