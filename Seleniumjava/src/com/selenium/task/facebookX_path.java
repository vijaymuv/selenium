package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookX_path {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.manage().deleteAllCookies();
		WebElement emailtxt = driver.findElement(By.xpath("//input[@name='email']"));
		emailtxt.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("abc");
		WebElement pagetext = driver.findElement(By.xpath("(//h2[contains(text(),'Facebook helps')])"));
		String fbpage = pagetext.getText();
		System.out.println(fbpage);
		WebElement createpage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String createpagetext = createpage.getText();
        System.out.println(createpagetext);
WebElement login = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
login.click();
Thread.sleep(3000);

		}

}
