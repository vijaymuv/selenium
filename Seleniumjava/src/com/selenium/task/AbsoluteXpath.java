package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//driver.get("https://www.flipkart.com/search?q=iphone+xr");	
				//driver.manage().deleteAllCookies();
		//WebElement iphone_xr = driver.findElement(By.xpath("html/body/div/div/div[3]/div/div/div/div/div/div/a/div/div/div/div/img"));
//iphone_xr.click();
		//Thread.sleep(3000);
		//driver.quit();
		//driver.get("https://www.flipkart.com/search?q=iphone+11");
		//driver.get("https://www.flipkart.com/search?q=jbl+earphones");
		//driver.get("https://www.flipkart.com/search?q=iphone+12");
		//WebElement iphone_11 = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div/div/div/div/a"));
		//iphone_11.click();
		driver.get("https://www.flipkart.com/search?q=samsung+f62");
		
	//WebElement iphone_12 = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div/div/div/div/a"));
	//iphone_12.click();
	//WebElement jbl_earphone = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div[3]/div/a/div/div/div/img"));
	//jbl_earphone.click();
WebElement samsung = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div/div/div/div/img"));
		samsung.click();
	}

}
