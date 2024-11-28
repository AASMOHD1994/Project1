package com.qa.testcases.RepeatTrial;

import java.util.Arrays;

public class SimpleArrayString3 {

	public static void main(String[] args) {

		String [] arr = {"aas", "mohd", "aas", "shumayla"};
		int temp = 0;
		int count = 0;

		for (int j = 0; j < arr.length; j++)
		{
			if (arr[j].equals("aas"))
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
			System.out.print(arr[i]+ " ");
		}

	}
}
