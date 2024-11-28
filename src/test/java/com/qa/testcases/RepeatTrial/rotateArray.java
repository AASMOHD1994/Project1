package com.qa.testcases.RepeatTrial;

import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 3, 6, 8, 9, 2 };
		int p = 0;

		while (p <= 1)
		{
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++)
			{
				arr[i] = arr[i + 1];
		    }

			arr[arr.length - 1] = temp;
			p++;
		}

		System.out.print("Rotated Array "+ Arrays.toString(arr));
	}

}
