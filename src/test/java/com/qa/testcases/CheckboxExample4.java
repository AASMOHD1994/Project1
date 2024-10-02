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

public class CheckboxExample4 {

	

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		

		String str = "Priyanka kumar sharma";
		String reqd = "";
		char m=' ';
		
		String [] s = str.split(" ");
		int initial=1;
		int count = s.length;
		
		for(String k: s)
		{
			if(initial<count)
			{
				m=k.charAt(0);
				if(reqd.isEmpty())
				{
					reqd=reqd+m;
					initial++;
					
				}
				
				else
				{
					reqd=reqd+"."+m;
					initial++;	
				}
				
			}
			else if(initial==count)
			{
				reqd=reqd+"."+k;
			}
			
		}
		
		System.out.println(reqd);
		
		
		
		
		
		
		}
		
		
		
		
		
		

		
	

}
