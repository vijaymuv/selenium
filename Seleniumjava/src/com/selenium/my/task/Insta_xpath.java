package com.selenium.my.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_xpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");	
		driver.manage().deleteAllCookies();
		WebElement emailtxt = driver.findElement(By.xpath("//input[@name='username']"));
		emailtxt.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("123466");
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Get the')]"));
		System.out.println(text.getText());
		WebElement forgettxt = driver.findElement(By.xpath("//a[text()='Forgotten your password?']"));
		System.out.println(forgettxt.getText());
		WebElement login = driver.findElement(By.xpath("(//button[contains(@type,'submit')])"));
		login.click();
		
		WebElement loginface = driver.findElement(By.xpath("(//button[contains(@type,'submit')])"));
		loginface.click();
		driver.quit();
		
	}

}
