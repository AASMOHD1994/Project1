package com.qa.pages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountDuplicates {

	public static void main(String[] args) {
		
		
		String s = "AAABBCCCDG";
		char [] arr =s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		Set<Character> hs = new HashSet<Character>();
		
		for(Character d: arr)
		{
			
			if(hm.containsKey(d))
			{
				hm.put(d, hm.get(d)+1);
			}
			
			else
				hm.put(d, 1);
			
		}
		
		hs=hm.keySet(); // with this alone you can remove duplicates
		
		System.out.println(hs);
		//System.out.println(hm);
		
		

	}

}
