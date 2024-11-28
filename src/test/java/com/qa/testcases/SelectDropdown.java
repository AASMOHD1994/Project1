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
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.Utilities;

public class SelectDropdown {

	

	@Test
	public void shadow() throws IOException, InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/shadow");
		driver.manage().window().maximize();
		
		WebElement host = driver.findElement(By.cssSelector("div.control"));
		SearchContext root1 = host.getShadowRoot();
		root1.findElement(By.cssSelector("input[type='text']")).sendKeys("enter");
		
	//	driver.close();
		
		
		
		
		
		
		}
		
		
		
		
		
		

		
	

}
