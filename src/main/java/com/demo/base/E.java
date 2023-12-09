package com.demo.base;

import java.util.HashMap;
import java.util.Map;

public class E {

	public static void main(String[] args) {
		
		int arr[] = {1,7,4,5,7,4,9};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (Integer i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

}
