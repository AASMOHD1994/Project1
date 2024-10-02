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

public class DynamicDropdownHandle {
	
	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("TV");
		Thread.sleep(2000);
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@class= 'col-12-12 bbjHWC QDWHTu']//a"));
		System.out.print(lst.size());
		
		for(WebElement ele: lst)
		{
			
			System.out.println(ele.getText());
		}
	}
	


}
