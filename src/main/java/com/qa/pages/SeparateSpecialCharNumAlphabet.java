package com.qa.pages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SeparateSpecialCharNumAlphabet {

	public static void main(String[] args) {

		segregate("ABD$%^&766235$%FG");

	}

	public static void segregate(String s) {
		StringBuffer Sc = new StringBuffer(), num = new StringBuffer(), alpha = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));
			}

			else if (Character.isAlphabetic(s.charAt(i))) {
				alpha.append(s.charAt(i));
			}

			else
				Sc.append(s.charAt(i));

		}

//		System.out.println(alpha);
//		System.out.println(num);
//		System.out.println(Sc);
		
		
		System.out.println(Character.isLowerCase('C'));
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isDigit('7'));
		System.out.println(Character.isAlphabetic('D'));
		System.out.println(Character.isWhitespace(' '));
		

	}

}
