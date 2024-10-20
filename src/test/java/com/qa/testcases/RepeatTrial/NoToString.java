package com.qa.testcases.RepeatTrial;

public class NoToString {
	
	public static void main(String [] args)
	{
		
		String s="A2B3C2D6";
		
		//AABBBCC
		
		char [] arr = s.toCharArray();
		String needed="";
		

		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(Character.isDigit(arr[i]))   
			{
				int k=Integer.parseInt(Character.toString(arr[i]));    //2,3,2,6
			    char reqd = arr[i-1];   //A,B,C
			    
				for(int j=0;j<k;j++)
				{
					needed=needed+reqd;  //AA
				}
			}
			
			
			
		}
		
		System.out.print(needed);
	}

}
