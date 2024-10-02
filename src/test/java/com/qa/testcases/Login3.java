package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login3 {
	
	@Test
	public void verifyLoginWithValidCred() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement eLink: links)
		{
			String link=eLink.getAttribute("href");
			
			URL url = new URL(link);
			//System.out.println(url);
			
			HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
			httpcon.connect();
			
			int rescode = httpcon.getResponseCode();
			
			if(rescode<400)
			{
				System.out.println("broken link- URL is " +rescode+ " "+ url );
			}
			
		}
	
	}
	


}
