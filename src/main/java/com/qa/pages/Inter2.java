package com.qa.pages;

import java.util.Arrays;
import java.util.HashMap;

public class Inter2 {

	public static void main(String[] args) {
		
		int [] arr = {2,0,6,4,0,9,3};
		
		int temp=0;
		int p=arr.length-1;
		while(p>=0)
		{
			
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		//	System.out.println(Arrays.toString(arr));
		}
		p--;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
