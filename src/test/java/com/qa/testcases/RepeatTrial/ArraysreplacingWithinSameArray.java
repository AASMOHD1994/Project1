package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysreplacingWithinSameArray {

	public static void main(String[] args) {
		
		
		int [] arr = {1,5,9,0,4,0,2,9,0,7,3,4,6};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-1;j++)
			{
				
				if(arr[j]==9)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
			}
		}
		
		System.out.print(Arrays.toString(arr));

	}
}