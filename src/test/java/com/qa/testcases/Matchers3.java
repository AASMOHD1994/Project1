package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Matchers3 {
	
	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException
	{
		String s="This is very good example of learning with ip 0555.04888.09.87 and got marks 27 and 93.8";
		
		Pattern p=Pattern.compile("[0-9]+[.]*[0-9]+[.]*[0-9]+[.]*[0-9]+");
		Matcher m =p.matcher(s);
		
		while(m.find())
		{
			
			System.out.println(m.group());
			
		}
		
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
	



