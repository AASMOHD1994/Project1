package com.qa.testcases.RepeatTrial;

public class Factorial {
	
	public static void main(String [] args)
	{
		
		int num=5;
		int result=1;
		
		for(int i=1;i<=num;i++)
		{
			result=result*i;
			
		}
		
	//1*2*3*4*5
		
		System.out.println(result);
		
	}

}
