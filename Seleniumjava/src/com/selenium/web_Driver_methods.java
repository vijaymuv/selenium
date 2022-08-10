package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_Driver_methods  {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("url:"+currentUrl);
		Dimension size = driver.manage().window().getSize();
		System.out.println("size:"+size);
Dimension d = new Dimension(700, 600);
driver.manage().window().setSize(d);
driver.manage().window().getSize();
	
	}

}
