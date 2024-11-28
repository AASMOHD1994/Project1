package com.qa.testcases.RepeatTrial;

public class withoutUsingThird {
	
	public static void main(String [] args)
	{
		
		String str1 ="My Name Is ";
		String str2="Aas Mohd";
		
		str1 =str1+str2; //My Name Is Aas Mohd
		
		str2 = str1.substring(0, str1.length()- str2.length()); // My Name Is 
		str1 = str1.substring(str2.length()); //aasmohd
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		
	}

}
