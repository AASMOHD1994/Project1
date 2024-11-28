package com.qa.testcases.RepeatTrial;

public class PrimeNo {
	
	public static void main(String [] args)
	{
		
		int num=7;
		
	
		for(int j=3;j<50;j++)
		{
			boolean flag=false;
			
			for(int i=2;i<j;i++)
			{
				
				if(j%i==0)
				{
					flag=true;
					break;
					
				}
			}
			
			if(flag==false)
			{
				
				System.out.println("No "+ j +" is prime");
			}
			
			
		}
		
		
	}

}
