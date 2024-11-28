package com.qa.testcases.RepeatTrial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringArrayWithoutInbuild {

	public static void main(String[] args) {

		String[] s1 = { "Chandra", "Jay", "Kushi", "Raj", "Dev", "Vishwas", "Ram" };
		String[] s2 = { "Jay", "Amit", "Suhas", "Raj", "Kishore", "Girish", "Ram", "Girl" };
		String[] s3 = new String[s1.length + s2.length];

		ArrayList<String> l = new ArrayList<String>();

		int count = 0;   //merging the two arrays and creating new array s3
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

		//finding the duplicates b/w first and sec array
		for (int i = 0; i < s1.length; i++) {

			for (int j = 0; j < s2.length; j++) {

				if ((s1[i].equals(s2[j]))) {
					l.add(s1[i]);
				}

			}
		}

		 System.out.print(l);
		 System.out.println();

		 System.out.print(Arrays.toString(s3));
		 System.out.println();
		 
		//removing or making common elements "";
		int Ncount = 0;

		for(int i=0;i<l.size();i++)
		{
			
		
			for (String kk : s3) {

				if ((kk.equals(l.get(i)))) {
					
					s3[Ncount]="";
					Ncount++;
				}
				else
				{
				
					s3[Ncount] = kk;
					Ncount++;
				}
		}
			Ncount=0;
		}
		
		System.out.println(Arrays.toString(s3));

		//sort the string array
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
	   
	   System.out.print(Arrays.toString(s3));

	}
}