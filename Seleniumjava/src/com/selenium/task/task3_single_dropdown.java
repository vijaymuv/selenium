package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task3_single_dropdown {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://letcode.in/dropdowns");	
					WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
					Select s = new Select(country);
					s.selectByIndex(6);
					s.selectByValue("Brazil");
				boolean multiple = s.isMultiple();
	System.out.println("is multiple multiple: "+multiple);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println("first Selected Option: "+firstSelectedOption.getText());

	}

}
