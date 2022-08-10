package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_explicit {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void invisible_() {
		driver.get("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("asfasd");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("435435");
		WebElement login = driver.findElement(By.xpath("//button[.='LOGIN']"));
		login.click();
		WebElement popup = driver.findElement(By.xpath("//div[@id='toast-container']"));
		wait = new WebDriverWait(driver,Duration.ofSeconds(11));
		wait.until(ExpectedConditions.invisibilityOf(popup));
		WebElement signup = driver.findElement(By.xpath("//a[.='Sign up']"));
		wait.until(ExpectedConditions.visibilityOf(signup));
		signup.click();
	}
	public static void alertis_present() {
		driver.get("https://letcode.in/waits");
		WebElement alert = driver.findElement(By.xpath("//button[.='Simple Alert']"));
		alert.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(11));
		wait.until(ExpectedConditions.alertIsPresent());	
		driver.switchTo().alert().accept();

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		
	 driver = new ChromeDriver();
	 invisible_();
	}
}
