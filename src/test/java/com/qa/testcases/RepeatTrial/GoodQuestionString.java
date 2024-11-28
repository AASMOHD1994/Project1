package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoodQuestionString {

	public static void main(String[] args) {

		String s = "abcdabcdeabcdefabc";
		Set<Character> hs = new HashSet<>();
		int start = 0;
		int end = 0;
		int maxlen=0;

		while (end < s.length())     // 0<14    1<14   2<14
		
		{
			if (!hs.contains(s.charAt(end)))  //
			
			{
				
				hs.add(s.charAt(end));
				maxlen=Math.max(maxlen, end-start+1);
				end++;
				


			}

			else {                               //abcd


				hs.remove(s.charAt(start));
				start++;
			}

		}
		
		System.out.print(hs);

	}

}
