package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.Utilities;

public class CheckboxExample2 {

	

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		

		String s ="this one is from epam";
		String reqd="";
		
		String [] arr = s.split(" ");
		
		for(String d: arr)
		{
			char [] m=d.toCharArray();
			
			for(int i=m.length-1;i>=0;i--)
			{
				reqd=reqd+m[i];
			}
			reqd=reqd+" ";
			
			
		}
		
		System.out.println(reqd.toString());
		
		
		
		
		
		
		}
		
		
		
		
		
		

		
	

}
