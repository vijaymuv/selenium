package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_Script_executor {
	public static WebDriver driver;
	public static void scrollInto_View() {
		driver.get("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement login = driver.findElement(By.xpath("//button[.='LOGIN']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
//sendkeys
	js.executeScript("arguments [0].value='adfff'", email);
	//highlight
	js.executeScript("arguments[0].setAttribute('style','color:pink')",email);
	//sendkeys
	js.executeScript("arguments [0].value='adfff'", pass);
	
	//scrollintoview
	js.executeScript("arguments[0].scrollIntoView()",login);
	//click
	js.executeScript("arguments[0].click()",login);	
	js.executeScript("window.scrollBy(x,y)");
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		
	driver = new ChromeDriver();
	scrollInto_View();
	
	}

}
