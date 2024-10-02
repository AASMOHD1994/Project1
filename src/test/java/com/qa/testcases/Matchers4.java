package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Matchers4 {
	
	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException
	{
		
		String g="Hey there How are YOU";
		
		String k = g.toUpperCase();
		
		String [] arr = k.split(" ");
		String rev = "";
		int count =0;
		
		for(String n: arr)
		{
			if(count%2==0)
			{
				char [] nn=n.toCharArray();
				String l="";
				for(int j=nn.length-1;j>=0;j--)
				{
					l=l+nn[j];
				}
				
				l=l+" ";
				
				rev=rev+l;
			}
			else {
				n=n+" ";
				rev=rev+n;
				
			
			}
			count++;
		}
		
		System.out.println(rev);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count=0;
//		Pattern p=Pattern.compile("AA");
//		Matcher m =p.matcher(s);
//		
//		while(m.find())
//		{
//			count++;
//			System.out.println(m.start());
//			
//		}
//		
//		System.out.println("The no of occurances are "+ count);

		



		
	
	
	}
	



