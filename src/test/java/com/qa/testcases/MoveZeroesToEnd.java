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

public class MoveZeroesToEnd  {

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {

		 int arr[] = { 6, 8, 2, 4, 3, 1, 5, 7, 8,9,9 };
		 int arr2[] = { 6, 8, 2, 4, 3, 1, 5, 7, 8,9,9 };
		 
		 int total [] = new int[arr.length+arr2.length];
		 int n = total.length;
		 int j=0;
		 
		 for(int i=0;i<total.length;i++)
		 {
			 if(i<arr.length)
			 {
				 total[i]=arr[i];
			 }
			 else if(i>=arr.length)
			 {
				 total[i]=arr2[j];
				 j++;
			 }
		 }
		 
		 System.out.println(Arrays.toString(total));
		 
		 FnInterf i = s->{return s;};
		 String k =i.m2(null);

		// System.out.print(k);
		 
		 Runnable r = ()->System.out.println("Yes");	
		 r.run();
		 
		
	}
	
	
	
	
	}

