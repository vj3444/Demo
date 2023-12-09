package com.demo.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) {

//		key-rollNumber
//		value-name;
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Vivek");
		map.put(2, "Rajat");
		map.put(3, "Jaiswal");
		map.put(4, "Chauhan");
		map.put(5,"I live in India");
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			
			if(entry.getKey()==5) {
				String str = entry.getValue();
				
				String st[] = str.split(" ");
				int i=1;
				StringBuffer sb1 = new StringBuffer();
				for(i=1;i<st.length-1;i++) {
					char ch[] = st[i].toCharArray();
					for(int j=ch.length-1;j>=i;j--) {
						sb1.append(ch[j]).toString();
					}
					System.out.print(sb1);
					System.out.println();
					i++;
					sb1=null;
				}
			}
			
//			System.out.println("Roll Number-->"+entry.getKey()+"  "+"Name-->"+entry.getValue());
			StringBuffer sb = new StringBuffer();
			
			if(entry.getKey()%2!=0) {
				
				String s = entry.getValue();
				
				char ch[] = s.toCharArray();
				for(int i=ch.length-1;i>=0;i--) {
//					System.out.print(ch[i]);
					sb.append(ch[i]);
					int rollNumber = entry.getKey();
					map.put(rollNumber, sb.toString());
				}
				
			}
			System.out.println();
			
			sb=null;
			System.out.println("Roll Number-->"+entry.getKey()+"  "+"Name-->"+entry.getValue());
			
		}
		
	}
}
