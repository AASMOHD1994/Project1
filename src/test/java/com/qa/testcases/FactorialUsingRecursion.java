package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class FactorialUsingRecursion {

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {
		
		//int [] arr = {1,2,3,1,3,4,5,7,3,3,5,6,7};		
	//	int n= arr.length/2;
		int count=0;
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,2,4,5,1,2,1,1,1,3,5,6,7,8));
		
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> last = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(Integer h: al)
		{
		if(h==1)
		{
			count++;
			temp.add(h);
		}
		}
		al.removeAll(temp);
		int n = al.size();
		
		
		while(count>0)
		{
			first.add(1);
			count--;
			
		}
		
		for(int j=0;j<n;j++)
		{
			if(j<al.size()/2)
			{
				last.add(al.get(j));
			}
			
			else if(j==al.size()/2)
			{
				last.addAll(j, first);
			}
			
			else
			{
				last.add(al.get(j));
			}
			
		}
		
		System.out.print(last);
		
		
		
		
		
		
		
		
		
				
	
		
}
}
