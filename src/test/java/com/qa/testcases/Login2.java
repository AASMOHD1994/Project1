package com.qa.testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login2 {

	@Test
	public void verifyLoginWithValidCred() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String window = driver.getWindowHandle(); // getCuurent window handle
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");

		Set<String> windowHandles = driver.getWindowHandles();

		for (String s : windowHandles) {
			String title = driver.switchTo().window(s).getTitle(); // if needed to print names of all page
		}

		driver.switchTo().window(window); // switching back to first window

	}

}
