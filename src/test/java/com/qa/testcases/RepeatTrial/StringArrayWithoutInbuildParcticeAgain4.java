package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringArrayWithoutInbuildParcticeAgain4 {

	public static void main(String[] args) {

		String[] s1 = { "Chandra", "Jay", "Kushi", "Raj", "Dev", "Vishwas", "Ram" };
		String[] s2 = { "Jay", "Amit", "Suhas", "Raj", "Kishore", "Girish", "Ram", "Girl" };
		String[] s3 = new String[s1.length + s2.length];
		String[] s4 = new String[s3.length];
		
		int count=0;
		for(int i=0;i<s3.length-1;i++)
		{
			if(count<s1.length)
			{
				s3[count++]=s1[i];
			}
			else
			{
				s3[count]=s2[count-s1.length];
				count++;
			}
		}
		
		s3[count++]=s2[s2.length-1];
		
	Arrays.sort(s3);
	System.out.println(Arrays.toString(s3));
	
	
	count=0;
	for(int i=0;i<s3.length-1;i++)
	{
		if(s3[i]!=s3[i+1])
		{
			s4[count++]=s3[i];
		}
	}
	
	s4[count++]=s3[s3.length-1];
	
	System.out.print(Arrays.toString(Arrays.copyOf(s4, count)));
		

	   

	}
}