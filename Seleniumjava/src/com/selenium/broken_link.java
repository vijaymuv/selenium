package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement> tagname = driver.findElements(By.tagName("a"));
	for (WebElement link : tagname) {
		String links  = link.getAttribute("href");
		if(links==null ||links.isEmpty()) {
continue;
		
		}
		URL url = new URL(links);
		URLConnection openConnection = url.openConnection();
		HttpURLConnection http = (HttpURLConnection) openConnection;
		http.connect();
		int code = http.getResponseCode();
		String responseMessage = http.getResponseMessage();
	//System.out.println("links: "+links +"code: "+ code+ "response Message: "+responseMessage);
		if (code>=400) {
			
			System.out.println("links: "+links +" code: "+ code + " response Message: "+responseMessage);

		}
	}
	
	
	}

}
