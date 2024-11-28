package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntArrayWithoutInbuild {

	public static void main(String[] args) {

		int [] arr = {7,2,4,5,7,3,5,7};
		int [] arr2 = new int [arr.length];
		int WTorem=7;
		int count=0;
		

		for(int i=0;i<arr.length;i++)
		{
		
			
			if(arr[i]!=WTorem)
			{
				arr[count]=arr[i];
				count++;
			}
			else
			{
			  arr[count]=0;
			  count++;
			}
		
	//	System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();
		
		System.out.print(Arrays.toString(arr));
		
		
		

		
	}
}