package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrialBubble {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 3, 5, 2, 6, 8, 93, 4, 6 };

		findSorted(arr);

	}

	public static void findSorted(int[] arr) {
		
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}
}
