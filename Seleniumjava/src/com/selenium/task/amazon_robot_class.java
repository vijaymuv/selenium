package com.selenium.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_robot_class {
	public static WebDriver driver;
	
	public static void down_enter_btn() throws AWTException {
		Robot a = new Robot();
		//down
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		//enter
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
}
	public static void right_click_enter(WebDriver c, WebElement d) {
		Actions a = new Actions(c);
		a.contextClick(d).perform();
	}
	

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\driver\\chromedriver.exe");
		
	 driver = new ChromeDriver();
	driver.get(
			"https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	//bestseller();
	WebElement best_seller = driver.findElement(By.xpath("//a[.='Best Sellers']"));
	WebElement customer_service = driver.findElement(By.xpath("//a[.=' Electronics ']"));
	WebElement electronics = driver.findElement(By.xpath("//a[.=' Electronics ']"));
	WebElement mobiles = driver.findElement(By.xpath("//a[.='Mobiles']"));
	right_click_enter(driver,best_seller);
	down_enter_btn();
	right_click_enter(driver,electronics);
	down_enter_btn();
	right_click_enter(driver,mobiles);
	down_enter_btn();
Set<String> allpages = driver.getWindowHandles();
String a = "Amazon.in Bestsellers: The most popular items on Amazon"; 
for (String ids : allpages) {
	//System.out.println(driver.switchTo().window(ids).getTitle());
	if (driver.switchTo().window(ids).getTitle().equals(a)) {
		System.out.println("actions performed");
	}
}
	}

}

