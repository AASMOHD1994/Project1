package com.qa.testcases.RepeatTrial;

public class FactorialUsingRecursion {
	
	
	public static void main(String [] args)
	{
		
		int num=5;
		int factorialResult=1;
		
		factorialResult=fact(4);
		System.out.println(factorialResult);
		
		
		
	}
	
	public static int fact(int num)
	{
		int result=1; // v.imp
		if(num>0)
		{
			
			result=(num)*(fact(num-1));
		}
		
		return result;
		
		
		
	}

}
