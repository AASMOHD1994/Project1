package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringArrayWithoutInbuildParcticeAgain2 {

	public static void main(String[] args) {

		String[] s1 = { "Chandra", "Jay", "Kushi", "Raj", "Dev", "Vishwas", "Ram" };
		String[] s2 = { "Jay", "Amit", "Suhas", "Raj", "Kishore", "Girish", "Ram", "Girl" };
		String[] s3 = new String[s1.length + s2.length];
		String[] s4 = new String[s3.length];
		
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
		
	
		String temp="";
		for(int i=0;i<s3.length;i++)
		{
			for(int j=0;j<s3.length-1;j++)
			{
				if(s3[j].compareTo(s3[j+1])>0)
				{
					temp=s3[j];
					s3[j]=s3[j+1];
					s3[j+1]=temp;
				}
			}
		}
		
		int ffCount=0;
		for(int i=0;i<s3.length-1;i++)
		{
			if(s3[i]==s3[i+1])
			{
				s3[i]="";
//				s4[ffCount]=s3[i];
//				ffCount++;
			}
		
		}
		
//		s4[ffCount]=s3[s3.length-1];
//		ffCount++;
		
		int fCount=0;
		for(String n: s3)
		{
			if(!(n.equals("")))
			{
				s4[fCount]=n;
				fCount++;
			}
		}
		
		System.out.print(Arrays.toString(s4));
	   

	}
}