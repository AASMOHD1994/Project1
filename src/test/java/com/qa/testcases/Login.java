package com.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void verifyLoginWithValidCred()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles under 5000");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	//	WebElement ele=driver.findElement(By.xpath("//span[@data-csa-c-content-id = 'p_89/KECHAODA']//following-sibling::li[@class='a-spacing-micro']//span[text()='See more']"));
		WebElement ele=driver.findElement(By.linkText("See more"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		driver.findElement(By.linkText("ZARALA")).click();
		
		
		
		WebElement checkbox=driver.findElement(By.xpath("//span[@data-csa-c-content-id='p_89/ZARALA']//i"));
		js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
		
		boolean isCheck=checkbox.isEnabled();
		Assert.assertEquals(isCheck, true);
		
		
		
		
	}
	


}
