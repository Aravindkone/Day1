package com.instagram.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\java\\SELENIUM\\selenium day1\\Instagram\\chromedriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("\"https://www.instagram.com/accounts/login/?hl=en)%20login%20page\"");
	
	WebElement i = driver.findElement(By.name("username"));
	
	i.sendKeys("sridharanyk");
	
	WebElement l = driver.findElement(By.name("password"));
	
	l.sendKeys("pass");
}
}
