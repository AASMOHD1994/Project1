package com.qa.pages;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s = "AAAABBBCD";
		char [] arr = s.toCharArray();
		HashSet hs = new HashSet<Character>();
		
		for(Character d: arr)
		{
			hs.add(d);
			
		}
		
		System.out.println(hs);

	}

}
