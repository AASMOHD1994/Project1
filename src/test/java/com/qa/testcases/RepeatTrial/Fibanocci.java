package com.qa.testcases.RepeatTrial;

public class Fibanocci {
	
//	0,1,1,2,3,5,8,13,21
	
	public static void main(String [] args)
	{
				
		int first=0;
		int sec=1;
		int result=1;
		int count=0;
		

		while(count<10)
		{
			System.out.print(first+" ");
			
			first=sec;
			sec=result;
			result=first+sec;
			count++;
		}

		
		
	}

	

}
