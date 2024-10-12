package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeArraysAndSort {
	
	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException
	{
	
		int [] arr1 = {1,2,5,6};
		int [] arr2 = {7,8,9,10,4,3};
		int k=arr2.length;
		int n=k;
		
		int [] comb = new int [arr1.length + arr2.length];
		int pos = 0;
		
		for(int i=0;i<comb.length;i++)
		{
			
			if(i<arr1.length)
			{
				comb[i]=arr1[i];
			}
			else if(i>=arr1.length)
			{

				comb[i]=arr2[k-(n--)];
				
			}
			
		}
		
		System.out.println(Arrays.toString(comb));
		
		

		
	
		
	
	}
	


}
