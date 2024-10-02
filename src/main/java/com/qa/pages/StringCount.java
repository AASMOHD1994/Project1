package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCount {

	public static void main(String[] args) {

		String s = "I am unique";
		String s1 = "I am unique";
		String s2 = new String("I am unique");
		String s3 = new String("I am unique");
		
		System.out.println('J'+'a');
		findLongestSubstring(s, s1,s2, s3);

	}

	public static void findLongestSubstring(String s, String s1,String s2, String s3) {
		
		System.out.println(s==s1);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);

	}
}
