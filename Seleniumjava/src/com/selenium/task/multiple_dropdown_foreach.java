package com.selenium.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_dropdown_foreach {
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
	for (WebElement a : alloptions) {
		System.out.println(a.getText());
		
		if (a.getText().equals("Batman") || a.getText().equals("Aquaman")) 
			
			{String text = a.getText();
			s.selectByVisibleText(text);
		}
	} 
}else {
	System.out.println("is singl");
}
}
}