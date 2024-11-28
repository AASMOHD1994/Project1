package com.qa.testcases.RepeatTrial;

import java.util.HashMap;
import java.util.Map;

public class StringToNo {
	
	public static void main(String [] args)
	{
		
		String s="AABBBCCDDDDDABBBB";
		String needed="";
		
		//
		
		char [] arr = s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		

		for(Character c: arr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			
			else
			{
				hm.put(c, 1);
			}
		}
		
		for(Map.Entry g: hm.entrySet())
		{
			needed=needed+g.getKey()+g.getValue();
			
		}
		
		System.out.print(needed);
		
			
		
	
		
	}

}
