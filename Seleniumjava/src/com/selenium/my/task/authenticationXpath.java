package com.selenium.my.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
driver.get("https://java:java@the-internet.herokuapp.com/basic_authq");


}
}
