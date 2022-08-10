package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods_webelement {
	public static void main(String[] args) throws My_exception, InterruptedException {
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");	
			driver.manage().deleteAllCookies();
			WebElement emailtxt = driver.findElement(By.xpath(""
					+ "//input[@name='email']"));
			WebElement pass = driver.findElement(By.xpath(
					"//input[@name='pass']"));

			if (emailtxt.isEnabled() && pass.isEnabled()) {
				emailtxt.sendKeys("abbvv");
				pass.sendKeys("asohdf");
				
			}else {
				throw new My_exception("is not enabled");
			}
			
		WebElement clickbtn = driver.findElement(By.xpath(
				"(//a[@role='button'])[2]"));
		clickbtn.click();
		
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath(
				"//label[text()='Male']"));
		male.click();
		WebElement female = driver.findElement(By.xpath(
				"//label[text()='Female']"));
System.out.println("is select or not:"+female.isSelected());
if (female.isSelected()) {
	System.out.println("is ok ");
	
}else {
	throw new My_exception("is not selected");

}}

}
