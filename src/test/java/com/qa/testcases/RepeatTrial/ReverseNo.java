package com.qa.testcases.RepeatTrial;

public class ReverseNo {
	
	public static void main(String [] args)
	{
		
		int num=12345;
		int revNo=0;
		int rem=0;

		
		while(num>0)
		{
			rem=num%10;
			revNo=revNo*10+rem;
			num=num/10;
			
		}
		
		System.out.print(revNo);
		
	}

}
