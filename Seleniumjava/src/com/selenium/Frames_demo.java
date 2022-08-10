package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;


public class Frames_demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");	
		WebElement click1 = driver.findElement(By.xpath("//a[@class='analystic']"));
		click1.click();
		driver.switchTo().frame("SingleFrame");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("textdata");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
driver.switchTo().frame(iframe1);
Thread.sleep(2000);
WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
driver.switchTo().frame(frame2);
WebElement textarea = driver.findElement(By.xpath("//input[@type='text']"));
textarea.sendKeys("jabva");
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();



	}

}
