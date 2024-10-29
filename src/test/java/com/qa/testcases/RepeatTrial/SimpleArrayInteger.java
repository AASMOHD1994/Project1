package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleArrayInteger {

	public static void main(String[] args) {

		int [] a = {11,3,6,9,1,2,5,7,8,9,2,3,4,5,10,10,11,1};
		int [] b = new int[a.length];
		
		//find the duplicates
		//find the uniques
		//completely remove the dups value
		Arrays.sort(a);
		
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				b[count++]=a[i];
			}
		}
		
		count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[count++]=a[i];
			}
		}
		
		b[count++]=a[a.length-1];
		
		count=0;
		//b[count++]=a[0];
		for(int i=0;i<a.length-1;i++)
		{

			if(a[i+1]!=9)
			{
				a[i]=a[i+1];
			}

			count=i;
		}
		
		
		System.out.println(Arrays.toString(Arrays.copyOf(a, count)));

	}
}