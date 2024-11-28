package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringArrayWithoutInbuildParcticeAgain {

	public static void main(String[] args) {

		String[] s1 = { "Chandra", "Jay", "Kushi", "Raj", "Dev", "Vishwas", "Ram" };
		String[] s2 = { "Jay", "Amit", "Suhas", "Raj", "Kishore", "Girish", "Ram", "Girl" };
		String[] s3 = new String[s1.length + s2.length];
		String[] s4 = new String [s3.length];

		int count = 0;   //merging the two arrays and creating new array s3  // single array
		int k = s1.length;
		for (int i = 0; i < s3.length; i++) {
			if (count < s1.length) {
				s3[i] = s1[i];
				count++;
			} else {
				s3[i] = s2[count - k];
				count++;
			}

		}
		
		System.out.println(Arrays.toString(s3));

		//sort the string array      //double array like bubble sort
		String tenp="";
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
	   
	   //removing duplicates    //single array
	   int gcount=0;
	   for(int i=0;i<s3.length-1;i++)
	   {
		   if(s3[i]!=s3[i+1])
		   {
			   s4[gcount]=s3[i];
			   gcount++;
		   }
	   }
	   
	   s4[gcount]=s3[s3.length-1];
	   gcount++;
	      
	   
	   System.out.print(Arrays.toString(Arrays.copyOf(s4, gcount)));
	   
	   
	   

	}
}