package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class waits_topic {
	public static WebDriver driver;
	public static void implicit_Wait_a() {
			
		driver.get("https://www.facebook.com");	
			WebElement emailtxt = driver.findElement(By.xpath("//input[@name='email']"));
			emailtxt.sendKeys("abc@gmail.com");
		
			Actions a = new Actions(driver);
			a.keyDown(Keys.CONTROL);
			a.sendKeys("a");
			a.sendKeys("c");
			a.keyUp(Keys.CONTROL);
			a.build().perform();
			a.sendKeys(Keys.TAB);
			a.keyDown(Keys.CONTROL);
			a.sendKeys("v");
			a.keyUp(Keys.CONTROL);
			a.build().perform();
			String email = emailtxt.getAttribute("value");
			System.out.println("emailvalue: "+email);
	}
	public static void pageload_waits_() {
		driver.get("https://www.facebook.com");	
		WebElement emailtxt = driver.findElement(By.xpath("//input[@name='email']"));
		emailtxt.sendKeys("abc@gmail.com");	
	}

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);

			 pageload_waits_();			
		
	}

}
