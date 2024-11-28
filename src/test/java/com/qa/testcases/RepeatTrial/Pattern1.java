package com.qa.testcases.RepeatTrial;

public class Pattern1 {
	
	public static void main(String [] args)
	{
		
		int [] arr= {1,2,5,7,7,7,4,5,8,8,898};
		int maxv = Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		
//		for(int i=0;i<arr.length;i++)
//		{
//			
//			if(arr[i]>maxv)
//			{
//				secMax=maxv;
//				maxv=arr[i];
//				     
//			}
//			
//			if(arr[i]>=secMax && arr[i]<maxv)
//			{
//				
//				secMax=arr[i];
//			}
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxv)
			{
				maxv=arr[i];
			}
		}
		
		System.out.print(maxv);
		
	}

}
