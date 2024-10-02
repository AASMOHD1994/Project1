package com.qa.pages;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public static WebElement DynwaitElePresence(WebDriver driver, long dur, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(dur));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public static WebElement DynFluentwaitElePresence(WebDriver driver, long dur, By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(dur))
				.pollingEvery(Duration.ofSeconds(1));
//				.ignoring(SocketException.class);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
