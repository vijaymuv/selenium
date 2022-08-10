package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown_month {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.manage().deleteAllCookies();
		WebElement clickcrtbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickcrtbtn.click();
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s2 = 	new Select(day);
		s2.selectByVisibleText("6");
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s = new Select(month);
		s.selectByIndex(3);
		WebElement year = driver.findElement(By.xpath("//select[@ria-label='Year']"));
		
		Select s1 = new Select(year);
		s1.selectByValue("2019");
		
	
	}
}
