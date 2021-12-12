package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace4\\Frames\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
	btnSubmit.click();
	Alert al = driver.switchTo().alert();
	
	String text = al.getText();
	System.out.println(text);
	al.accept();
}
}
