package com.selenium.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_copy_paste_tab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String email = emailtxt.getAttribute("value");
		System.out.println("emailvalue: "+email);
	
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		String password = pass.getAttribute("value");
		System.out.println("password:"+password);
if (email.equalsIgnoreCase(email)==password.equalsIgnoreCase(password)) {
	System.out.println("is same value");
	
}		else {
	System.out.println("is different value");
		
}	
	}

}
