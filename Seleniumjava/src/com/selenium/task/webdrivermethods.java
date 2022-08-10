package com.selenium.task;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class webdrivermethods {
		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	driver.manage().deleteAllCookies();
	String title = driver.getTitle();
	System.out.println("title:"+title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("currentUrl:"+currentUrl);
	driver.navigate().to("https://www.youtube.com/");
	String title2 = driver.getTitle();
	System.out.println("title2:"+title2);
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println("currentUrl2:"+currentUrl2);
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().refresh();
	Dimension d = new Dimension(700, 590);
	driver.manage().window().setSize(d);
	driver.quit();
	String title3 = driver.getTitle();
	System.out.println("title2:"+title3);
	}

}
