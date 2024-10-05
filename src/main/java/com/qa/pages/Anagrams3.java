package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagrams3 {

	public static void main(String[] args) {
		
		String s="001200908700876098";
		
		MoveZeroes(s);
		
		
	}
	
	public static  void MoveZeroes(String s)
	{
		
		char [] arr = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		

		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]=='0' && i==0)
				{
					sb.append(arr[j]);
					
				}
				
				if(arr[j]!='0' && i==1)
				{
					sb.append(arr[j]);
				}
			}
		}
		
		
		
		System.out.println(sb);
		
		
		
		
	}
	
}
