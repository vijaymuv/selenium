package com.selenium.task;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTbl_ages_task {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		Thread.sleep(3000);
		
	List<WebElement> ages = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[4]"));
	for (int i = 0; i < ages.size(); i++) {
		String age = ages.get(i).getText();
		int ages_of_tables = Integer.parseInt(age);
		if (ages_of_tables>61) {
			System.out.println(ages_of_tables);
			
}
}
}
}