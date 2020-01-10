package com.instagram.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java\\SELENIUM\\selenium day1\\Instagram\\chromedriver\\chromedriver.exe");
		WebDriver t= new ChromeDriver();
	t.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
	WebElement username = t.findElement(By.name("username"));
	username.sendKeys("8526278052");
	WebElement password = t.findElement(By.name("password"));
	password.sendKeys("Aravind123@");
	WebElement element = t.findElement(By.id("pass"));
	element.sendKeys("1234@");
	WebElement element1 = t.findElement(By.id("pass"));
	element1.sendKeys("1234@");
	
	t.quit();
	
		
	}

}
