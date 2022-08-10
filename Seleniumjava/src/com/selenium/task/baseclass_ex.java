package com.selenium.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class baseclass_ex {
	public static String name;
public static void actions_demo(WebDriver driver, WebElement refname) {
Actions a = new Actions(driver);
a.contextClick(refname).perform();
	}
	public static void data(String name) {
System.out.println("toupper case: "+name.toUpperCase());
	}
public static void main(String[] args) {

name="java";
data(name);


	}

}
