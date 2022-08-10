package com.selenium.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_salary {
	public static WebDriver driver;
public static void salary_xpath() {
List<WebElement> salary = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[6]"));
for (int i = 0; i < salary.size(); i++) {
	System.out.println(salary.get(i).getText().replaceAll("[^0-9]", ""));
}
}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		Thread.sleep(3000);
		salary_xpath();
	}

}
