package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IobBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace4\\\\Frames\\\\Driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:www.facebook.com/");
	WebElement txtUser = driver.findElement(By.name("email"));
	txtUser.sendKeys("gopi123");
	WebElement txtPass = driver.findElement(By.name("password"));
	txtPass.sendKeys("gopi321");
	WebElement btnContinue = driver.findElement(By.name("submit"));
	btnContinue.click();


}
}
