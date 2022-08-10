package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_dress {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			Thread.sleep(3000);
			
		WebElement tshirt = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/a[@title='T-shirts']"));
			Actions a = new Actions(driver);
		a.moveToElement(tshirt).build().perform();
			Thread.sleep(2000);
			a.doubleClick(tshirt).perform();
			//WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		/////	a.moveToElement(women).perform();
			//Thread.sleep(2000);
			//WebElement blouses = driver.findElement(By.xpath("//ul[@style='display: none;']/child::li/a[@title='Blouses']"));
			//a.moveToElement(blouses).perform();
		//	Thread.sleep(2000);
			//a.click(blouses).perform();
	}

}
