package com.qa.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Matchers {
	
	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException
	{
		
		ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		ArrayList<Integer> n = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		
		n=(ArrayList<Integer>) l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		n.stream().forEach(System.out::print);
		
		d=(ArrayList<Integer>) l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		d.stream().forEach(System.out::println);	
		
		System.out.println(l.stream().map(i->i+5).collect(Collectors.toList()));	
		System.out.println(l.stream().max((i1,i2)->i1.compareTo(i2)).get());
		
		Integer[] arr=l.stream().toArray(Integer[]::new);	
		System.out.println(Arrays.toString(arr));
		
		Stream.of(arr).forEach(System.out::println);
		
		Stream ss = Stream.of(1,2,3,5,6,1);
		ss.forEach(System.out::println);
		
		
		
		
		
		


		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count=0;
//		Pattern p=Pattern.compile("AA");
//		Matcher m =p.matcher(s);
//		
//		while(m.find())
//		{
//			count++;
//			System.out.println(m.start());
//			
//		}
//		
//		System.out.println("The no of occurances are "+ count);

		



		
	
	
	}
	



