package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith_demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement text = driver.findElement(By.xpath("(//a[starts-with(text(),'Create')])[2]"));
		System.out.println("starts with "+text.getText());
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		//integer value into send keys method
		email.sendKeys(Integer.toString(934572304));
		
	}

}
