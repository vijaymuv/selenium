package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alerts_selenium2 {
	public static WebDriver driver;
	
	private static void simple_alert() throws InterruptedException {

		WebElement alert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert.click();
		Thread.sleep(2000);
		Alert simlpe_alert = driver.switchTo().alert();
		simlpe_alert.accept();
		Thread.sleep(2000);
	}
	public static void confirm_alert() throws InterruptedException {
		WebElement alert1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
alert1.click();
WebElement confirm_alert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
confirm_alert.click();
Thread.sleep(2000);
		Alert confirm_alert1 = driver.switchTo().alert();
		confirm_alert1.accept();
		
	}
	
	public static void prompt() throws InterruptedException {
WebElement alert3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
alert3.click();
Thread.sleep(2000);
WebElement box = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
box.click();
Alert prompt_alert = driver.switchTo().alert();
prompt_alert.accept();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito");
		driver = new ChromeDriver(opt);
		driver.get("http://demo.automationtesting.in/Alerts.html");	
		Thread.sleep(3000);	
		simple_alert();
		confirm_alert();
		prompt();
		
	}

}
