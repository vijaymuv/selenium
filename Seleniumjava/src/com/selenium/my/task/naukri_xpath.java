package com.selenium.my.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?");	
		driver.manage().deleteAllCookies();
		WebElement text = driver.findElement(By.xpath
				("//p[contains(text(),'Build your profile and')]"));
		System.out.println(text.getText());
		WebElement emailtxt = driver.findElement(By.xpath
				("//input[contains(@placeholder,'What is your name?')])[1]"));
		emailtxt.sendKeys("abcd@gmail.com");
		
	}

}

