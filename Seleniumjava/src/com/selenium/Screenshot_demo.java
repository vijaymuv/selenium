package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_demo {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\snaps\\before_run.png");
	FileUtils.copyFile(source, destination);
	WebElement email_txt = driver.findElement(By.id("email"));
	email_txt.sendKeys("acb@gmail.com");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("1244");
	File source1 = ts.getScreenshotAs(OutputType.FILE);
	File destination1 = new File("C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\snaps\\after_run.png");
	FileUtils.copyFile(source1, destination1);

	//get attribute value
	System.out.println("attibute value is : "+pass.getAttribute("value"));
	//getTagName
	System.out.println("get tagname:"+pass.getTagName());

	//get location
	System.out.println("location: "+pass.getLocation());

	//getSize

	System.out.println("size:"+pass.getSize());

	//getCssvalue
	System.out.println("css value:"+pass.getCssValue("height"));
//get rectangle		
System.out.println("get rectangle: "+pass.getRect());
		
		
	
	}

}
