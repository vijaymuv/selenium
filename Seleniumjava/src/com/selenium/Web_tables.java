package com.selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_tables {
	public static WebDriver driver;
public static void all_tables() {
List<WebElement> tables = driver.findElements(By.tagName("table"));

System.out.println(tables.size());
	
}
public static void particular_data() {
	WebElement data = driver.findElement(By.xpath("//table[@id='table01']/tbody/tr[2]/td[4]"));
	System.out.println("particular data:"+data.getText());
	
}
public static void particular_row() {
	int acct_index=0;
List<WebElement> row_data = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[3]"));
for (int i = 0; i <row_data.size(); i++) {
	
	System.out.println("ALL ROW:" +row_data.get(i).getText());
	
}
System.out.println("by foreach loop");
for (WebElement webElement : row_data) {
	
	System.out.println(webElement.getText());
	
}	
}
public static void particular_column() {
	List<WebElement> column_data = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/tb[5]"));
	for (int i = 0; i < column_data.size(); i++) {
		System.out.println("column_data: "+column_data.get(i).getText());
	}
}

public static void all_data() {
List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
for (int i = 0; i <alldata.size(); i++) {
	System.out.println("all data:"+alldata.get(i).getText());
	
}
}
public static void all_header() {
List<WebElement> allheader = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
for (WebElement all_header1 : allheader) {
	System.out.println("allheader:"+all_header1.getText());
	
}
}
public static void index_fo() {
	int acct_index=0;
 List<WebElement> index_of_header = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
for (int i = 0; i < index_of_header.size(); i++) {
	if (index_of_header.get(i).getText().equals("Accountant")) {
		acct_index=i+1;
		break;
	}	
	
}
System.out.println(acct_index);
List<WebElement> account = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td["+acct_index+"]"));
for (WebElement a : account) {
	System.out.println(a.getText());
}
}
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\005\\eclipse-workspace\\Automation_project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://qavbox.github.io/demo/webtable/");
	Thread.sleep(3000);
	index_fo();
	}

}
