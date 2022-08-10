package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {
	public static WebDriver driver;
	
	public static void robotclass() throws AWTException {
WebElement gmail = driver.findElement(By.xpath("//a[.='Images']//preceding::a"));
		Actions b = new Actions(driver);
		b.contextClick(gmail).perform();
		Robot a = new Robot();
	a.keyPress(KeyEvent.VK_DOWN);
	a.keyRelease(KeyEvent.VK_DOWN);
	//enter
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	robotclass();
	}

}
