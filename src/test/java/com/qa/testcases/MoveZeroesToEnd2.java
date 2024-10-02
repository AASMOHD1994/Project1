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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeroesToEnd2 {

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {

		 int arr[] = { 6, 8, 2, 4, 3, 1, 5, 7, 8,9,9 };

		    int largest = Integer.MIN_VALUE;
		    int second_largest = Integer.MIN_VALUE;

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] > largest) {
		            second_largest = largest;
		            largest = arr[i];
		        }
		        if (arr[i] >= second_largest && arr[i] < largest) {
		            second_largest = arr[i];
		        }
		    }

		    System.out.println("Second Largest element is " + second_largest);
		}
		

	}

