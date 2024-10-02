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
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.Utilities;

public class CheckboxExample3 {

	By ExpectedText = By.xpath("//div[@id='finish']/h4");

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=y6LbGfmQPkE&t=250s");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://iengage.coforge.com/ess2/login");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.incometax.gov.in/iec/foportal/");
		
		for(String head: driver.getWindowHandles())
		{
			String myTitle = driver.switchTo().window(head).getTitle();
			Thread.sleep(2000);


			if(myTitle.contains("Login"))
			{
				break;
			}
		}
		
		
		
		
		
		

		
	}

}
