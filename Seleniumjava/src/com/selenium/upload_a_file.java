package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_a_file {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
	driver.get("https://www.monsterindia.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15) );
	WebElement upload = driver.findElement(By.xpath("//span[.='Upload Resume']"));
	upload.click();
WebElement upload_resume = driver.findElement(By.id("file-upload"));
upload_resume.sendKeys("E:\\vijay\\vijay resume.docx");
	
	}

}
