package com.qa.testcases.RepeatTrial;

import java.util.Arrays;

public class SimpleArray2 {

	public static void main(String[] args) {

		int[] arr = new int[] {3, 4, 5,3,3 ,1};
		int temp = 0;
		int count = 0;

		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j] == 3)
			{
				count++;

				for (int i = j; i < arr.length - 1; i++)
				{

					arr[i] = arr[i + 1];

				}
				
				j--;
			}
		}

		//System.out.print(Arrays.toString(arr));
		for(int i=0;i<arr.length-count;i++)
		{
			System.out.print(arr[i]);
		}

	}
}
