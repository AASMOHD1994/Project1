package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoodQuestionString3 {

	public static void main(String[] args) {

		String s = "abcdabcdeabcdefabc";
		Set<Character> hs = new HashSet<>();
		int start = 0;
		int end = 0;
		int maxlen=0;

		while(s.length()>end)
		{
			if(!hs.contains(s.charAt(end)))
			{
				hs.add(s.charAt(end));
				maxlen=Math.max(maxlen, end-start+1);
				end++;
			}
			else
			{
				hs.remove(s.charAt(start));
				start++;
			}
		}
		
		
		System.out.println(hs);
	}

}
