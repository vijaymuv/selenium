package com.selenium.my.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linked_xpath {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.linkedin.com/login");	
			driver.manage().deleteAllCookies();
			WebElement text = driver.findElement(By.xpath
					("//p[contains(text(),'Stay updated on you')]"));
			System.out.println(text.getText());
			WebElement emailtxt = driver.findElement(By.xpath
					("//input[@name='session_key']"));
			emailtxt.sendKeys("abcd@gmail.com");
			WebElement password = driver.findElement(By.xpath
					("//input[@aria-label='Password']"));
			password.sendKeys("123466");
			WebElement login = driver.findElement(By.xpath(
					"//a[text()='Forgot password?']"));
			login.click();
			WebElement partialtext = driver.findElement(By.xpath("(//p[contains(text(),'Reset password in')])"));
			System.out.println(partialtext.getText());
			WebElement emailid = driver.findElement(By.xpath(
					"(//input[contains(@name,'userName')])[1]"));
			emailid.sendKeys("bcncn@gmail.com");
			driver.quit();
			
		
		
	}

}
