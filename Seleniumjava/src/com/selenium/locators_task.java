package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\005\\\\eclipse-workspace\\\\Seleniumjava\\\\driver\\\\chromedriver.exe");
			WebDriver driver = new 	ChromeDriver();
			driver.get("https://www.instagram.com/");
			WebElement ForgetPass = driver.findElement(By.linkText("Forgotten your password?"));
			ForgetPass.click();
			WebElement email_txt = driver.findElement(By.partialLinkText("Enter your email"));
			email_txt.sendKeys("bcd@gmail.com");
			
	}

}
