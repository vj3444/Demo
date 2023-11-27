package com.demo.base;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Account {
   
    
    public static String StringChallenge(String str) {
    	String[] words = str.split(" ");

        for (String word : words) {
            if (hasThreeUniqueDigits(word)) {
                continue;
            } else {
                return "false";
            }
        }

        return "true";
    }

    private static boolean hasThreeUniqueDigits(String word) {
    	int digitCount = 0;
        Set<Character> uniqueDigits = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
                uniqueDigits.add(ch);
            }
        }

        return digitCount == 3 && uniqueDigits.size() == 3;

   
    
    }

    public static void main (String[] args) {  
      // keep this function call here     
      Scanner s = new Scanner(System.in);
      System.out.print(StringChallenge(s.nextLine())); 
    }
}
