package com.qa.pages;

import java.util.HashMap;
import java.util.Map.Entry;

public class IterateHashMapUsingEntry {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		hm.put('A', 1);
		hm.put('B', 5);
		hm.put('C', 3);
		hm.put('A', 2); // latter one will replace former one
		
	//	System.out.println(hm);
		
		for(Entry<Character, Integer> ent:hm.entrySet())
		{
			System.out.println(ent.getKey() + " "+ ent.getValue() );
		}

	}

}
