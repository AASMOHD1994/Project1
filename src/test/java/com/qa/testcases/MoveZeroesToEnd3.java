package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeroesToEnd3 {

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		RemoteWebDriver driver =  new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=y6LbGfmQPkE&t=250s");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.switchTo().newWindow(WindowType.TAB).get("https://iengage.coforge.com/ess2/login");
//		driver.switchTo().newWindow(WindowType.TAB).get("https://www.incometax.gov.in/iec/foportal/");
//		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	};


	}

