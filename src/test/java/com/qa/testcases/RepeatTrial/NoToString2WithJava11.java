package com.qa.testcases.RepeatTrial;

public class NoToString2WithJava11 {
	
	public static void main(String [] args)
	{
		
		String s="A2B3C2D6EFG7";
		
		//AABBBCC
		
		char [] arr = s.toCharArray();
		String needed="";
		

		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(Character.isDigit(arr[i]))  
			{
				int k=Integer.parseInt(Character.toString(arr[i]));    //2,3,2,6
			    char reqd = arr[i-1];   //A,B,C
			    
				needed=needed+Character.toString(reqd).repeat(k);
			}
			
			
			
		}
		
		System.out.print(needed);
	}

}
