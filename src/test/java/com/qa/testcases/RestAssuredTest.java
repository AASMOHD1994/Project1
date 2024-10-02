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

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredTest {

	@Test
	public void verifyLoginWithValidCred() throws IOException, InterruptedException {

		Response res = given()
		.contentType("application/json")
		.when()
	//	.get("https://jsonplaceholder.typicode.com/posts");
		.get("https://reqres.in/api/users?page=2");
		
	
	//	JSONArray arr = new JSONArray(res.asString());
		JSONObject ob = new JSONObject(res.asString());
		
		
	
		System.out.print(ob.getJSONArray("data").getJSONObject(1).get("id"));
		
		
	}
		

	}

