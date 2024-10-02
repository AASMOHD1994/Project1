package com.qa.testcases;

import java.awt.Robot;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.Utilities;

public class CheckboxExample {

	By ExpectedText = By.xpath("//div[@id='finish']/h4");
	By btn =By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@value='Google Search']");
	

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Mobiles");
	driver.switchTo().defaultContent();

	new Actions(driver).sendKeys(Keys.ESCAPE).perform();
//	WebElement bttn=driver.findElement(btn);
//	bttn.click();
	
//	driver.navigate().back();
	
	//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Mobiles");
	
	
		
		
		
		
		
		

		
	}

}
