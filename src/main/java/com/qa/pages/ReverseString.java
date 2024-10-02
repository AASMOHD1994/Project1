package com.qa.pages;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "My Name is King";
		String result="";
		
		String [] arr = s.split(" ");
		
		for(String m: arr)
		{
			result = m +" "+ result;
			
		}
		
		System.out.println(result);
 
	}

}
