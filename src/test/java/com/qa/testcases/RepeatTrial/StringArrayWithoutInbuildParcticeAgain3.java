package com.qa.testcases.RepeatTrial;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayWithoutInbuildParcticeAgain3 {

	public static void main(String[] args) {

		int [] a = {1,4,6,8,9,0,9,4,1,5,0};
		int [] b = new int[a.length];
		
		Arrays.sort(a);
		
	//	Print the uniques only
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[count++]=a[i];
			}
		}
		
		b[count++]=a[a.length-1];
		
		System.out.print(Arrays.toString(Arrays.copyOf(b, count)));
		

	}
}