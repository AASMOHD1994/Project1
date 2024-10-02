package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Uniquesubstring {

	public static void main(String[] args) {

		String s = "aaaaabbbacccbccdc";

		findLongestSubstring(s);

	}

	public static void findLongestSubstring(String s) {

		
		String k = "";
		for (int i = 0; i < s.length(); i++) {

			int count = 0;
			if (!(k.contains(Character.toString(s.charAt(i))))) {
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == (s.charAt(j))) {
						count++;
					}

				}

				k = k + s.charAt(i) + count;
			}
		}

		System.out.println(k);

	}
}
