package com.selenium.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class multiple_dropdown {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://letcode.in/dropdowns");
			WebElement heros = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s = new Select(heros);
	if (s.isMultiple()) {
		List<WebElement> alloptions = s.getOptions();
		System.out.println("Size: "+alloptions.size());
		for (int i = 0; i <=alloptions.size()-1; i++) {
			if (alloptions.get(i).getText().equals("Doctor Strange")
					|| alloptions.get(i).getText().equals("Ghost Rider"))
				
				{
			String Heroname = alloptions.get(i).getText();
			s.selectByVisibleText(Heroname);
		}
		}
	}else {
		System.out.println("is single");
	}
	}
}