package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompareStrings {

	public static void main(String[] args) {

		String s = "abcabdabccdfgh";		
		System.out.println(findLongestSubstring(s));

	}

	public static HashSet<Character> findLongestSubstring(String s) {		
		int maxLength=0;
		int start=0;
		int end=0;
		HashSet<Character> hs = new HashSet<Character>();
		
		while(end<s.length())
		{
			
			if(!hs.contains(s.charAt(end)))
			{
				hs.add(s.charAt(end));
				maxLength=Math.max(maxLength,end-start+1);
				end++;
			}
			
			else
			{
				hs.remove(s.charAt(start));
				start++;
			}
		}
		
		return hs;	

	}

}
