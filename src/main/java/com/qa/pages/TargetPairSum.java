package com.qa.pages;

import java.util.HashSet;

public class TargetPairSum {

	public static void main(String[] args) {
		
		int [] arr = {2,8,5,4,9,1,7,2};
		int target = 10;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					hs.add(arr[i]);
					hs.add(arr[j]);
					System.out.println(arr[i]+ " "+arr[j]);
					
				}
				
				
			}
		}
		
	//	System.out.println(hs);

	}

}
