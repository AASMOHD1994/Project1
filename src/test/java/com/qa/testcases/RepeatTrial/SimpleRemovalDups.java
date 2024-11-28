package com.qa.testcases.RepeatTrial;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleRemovalDups {

	public static void main(String[] args) {

		String[] s1 = { "Chandra", "Jay", "Kushi", "Raj", "Dev", "Vishwas", "Ram" };
		String[] s2 = { "Jay", "Amit", "Suhas", "Raj", "Kishore", "Girish", "Ram", "Girl" };
		String[] s3 = new String[s1.length + s2.length];
	//	String[] s4 = new String[s3.length];
		
		int mCount=0;
		for(int i=0;i<s3.length;i++)
		{
			if(mCount<s1.length)
			{
				s3[mCount]=s1[i];
				mCount++;
			}
			else
			{
				s3[mCount]=s2[mCount-s1.length];
				mCount++;
			}
		}
		

		//List g=Stream.of(s3).sorted().collect(Collectors.toList());
		HashSet<String> k = new HashSet<String>(Arrays.asList(s3));
		List g=k.stream().sorted().collect(Collectors.toList());
		
		System.out.print(g);
		
		

	}
}