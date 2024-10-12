package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrams {

	public static void main(String[] args) {
		
		String a="silent";
		String b="listen";
		
		char [] arr = a.toCharArray();
		char [] arr1 = b.toCharArray();
		
		boolean flag = checkAnagrams(arr,arr1);
		
		System.out.println(flag);
		
		
		
	}
	
	public static boolean checkAnagrams(char [] arr, char [] arr1)
	{
		int count=0;
		if(arr.length==arr1.length)
		{
			for (int i=0;i<arr.length;i++)
			{
				
				for(int j=0;j<arr1.length;j++)
				{
					
					if(arr[i]==arr1[j])
					{
						//arr[i]='$';
						count++;
					}
				}
				
			}
			
			if(arr.length==count)
			{
				return true;
			}
			else
				return false;
			
			
		}
		return false;
		
		
		
	}
	
}
