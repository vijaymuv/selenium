package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email_txt = driver.findElement(By.id("email"));
	email_txt.sendKeys("acb@gmail.com");
	WebElement pass_txt = driver.findElement(By.id("pass"));
	pass_txt.sendKeys("1244");
	WebElement frgpass = driver.findElement(By.linkText("Forgotten password?"));
	frgpass.click();
	WebElement emailfrg = driver.findElement(By.name("email"));
	emailfrg.sendKeys("bcd@gmail.com");
	driver.navigate().back();
	WebElement page = driver.findElement(By.partialLinkText("Create a Page"));
	page.click();
	
	
	}
	

}
