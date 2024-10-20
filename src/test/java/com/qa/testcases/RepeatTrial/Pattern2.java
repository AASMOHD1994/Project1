package com.qa.testcases.RepeatTrial;

public class Pattern2 {

	public static void main(String[] args) {
		int k = 0;

		for (int i = 0; i <= 4; i++)
		{

			for (int j = 0; j <= 4; j++) 
			{

				if (j >= 2 - k && j <= 2 + k)
				{
					System.out.print("*");

				} else 
				{
					System.out.print(" ");
				}

			}

		        	if (i < 2)
		        	{
			        	k++;
		        	} else
		        	{
			        	k--;
			        }

			System.out.println();
		}

	}

}
