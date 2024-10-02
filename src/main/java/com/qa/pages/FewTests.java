package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FewTests {

	public static void main(String[] args) {

		findSorted();

	}

	public static void findSorted() {
		
		int [] arr = {1,2,3,6,8,3,5,7,8,1,5,9};
		int [] arr2 = new int [arr.length-1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=9)
			{
				arr2[i]=arr[i];
			}
		}
		
		
		
		
		
		System.out.println(Arrays.toString(arr2));
		
	}
}
