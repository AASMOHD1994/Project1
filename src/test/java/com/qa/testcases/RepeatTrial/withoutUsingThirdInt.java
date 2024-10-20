package com.qa.testcases.RepeatTrial;

public class withoutUsingThirdInt {
	
	public static void main(String [] args)
	{
		
		int a=10;
		int b=20;
		
		System.out.println("a before "+a+ " b before "+b);
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.print("a after "+a+ " b after "+b);
		
		
		
	}

}
