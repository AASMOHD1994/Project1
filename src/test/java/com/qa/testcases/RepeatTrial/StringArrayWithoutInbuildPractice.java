package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayWithoutInbuildPractice {

	public static void main(String[] args) {

		String[] s1 = { "Chandra", "Jay", "Kushi", "Raj", "Dev", "Vishwas", "Ram" };
		String[] s2 = { "Jay", "Amit", "Suhas", "Raj", "Kishore", "Girish", "Ram", "Girl" };
		String[] s3 = new String [s1.length+ s2.length];
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i].equals(s2[j]))
				{
					al.add(s1[i]);
				}
			}
		}
		//String=Arrays.copyOf(s1,FCount);
		
		int count=0;
		for(int i=0;i<s3.length;i++)
		{
			if(count<s1.length)
			{
				
				s3[count]=s1[i];
				count++;
			}
			
			else
			{
				s3[count]=s2[count-s1.length];
				count++;
			}
		}
		
		int Ncount = 0;
		int NArray=0;

		for (int i = 0; i < al.size(); i++)
		{
			Ncount = 0;

			for (String k : s3)
			{

				if (k.equals(al.get(i)))
				{
					
					s3[Ncount] = "";
					Ncount++;
				} else
				{
					s3[Ncount] = k;
					Ncount++;
				}
			}
			

		}
		
	
	System.out.println(Arrays.toString(s3));	
		
		String tenp;
		for(int i=0;i<s3.length;i++)
		{
			for(int j=0;j<s3.length-1;j++)
			{
				if(s3[j].compareTo(s3[j+1])>0)
				{
					     tenp=s3[j];
					     s3[j]=s3[j+1];
					     s3[j+1]=tenp;
				}
			}
		}
		
		
		for(String k: s3)
		{
			if(!(k.equals("")))
			al2.add(k);
		}
		
	//	al2=(ArrayList<String>) al2.stream().sorted().collect(Collectors.toList());
		
		
		
		System.out.println(Arrays.toString(s3));
		System.out.print(al2);
		//Stream.of(s3).sorted().collect(Collectors.toList());
//		List<String> all = Stream.of(s3).sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
//		System.out.print(all);
	   
	  

	}
}