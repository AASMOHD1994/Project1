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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.Utilities;

public class ComplexXpath {

	By ExpectedText = By.xpath("//div[@id='finish']/h4");
	By btn = By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@value='Google Search']");

	By cv = By.xpath("//span[@class='action-inner' and text()='Sign in']");

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    WebElement n=driver.findElement(By.linkText("Formal Shoes"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	 // js.executeScript("window.scrollBy(0,5000);");
//	    js.executeScript("arguments[0].scrollIntoView(true);", n);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		 driver.findElement(cv).click();

	}

}
