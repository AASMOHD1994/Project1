package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrams2 {

	public static void main(String[] args) {
		
		int i=12321;
	
		
		int k=checkPlaindrome(i);
		
		System.out.println(k==i);
		
		
	}	
	
	
	public static int checkPlaindrome(int num)
	{
		
		int rev=0;
		while(num>0)
		{
			int rem= num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
			
		}
		
		return rev;
		
	}
		
}
