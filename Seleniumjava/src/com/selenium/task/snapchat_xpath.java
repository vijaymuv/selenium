package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapchat_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.snapchat.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[contains(@name,'password')])"));
		pass.sendKeys("123453&sele");
		WebElement login = driver.findElement(By.xpath("//button[@id='loginTrigger']"));
		login.click();
		WebElement Text = driver.findElement(By.xpath("//span[text()='New To Snapchat?']"));
		System.out.println(Text.getText());
		
		WebElement partialtxt = driver.findElement(By.xpath("//p[contains(text(),'Please solve')]"));
		System.out.println(partialtxt.getText());
		driver.quit();
		
	}
}
