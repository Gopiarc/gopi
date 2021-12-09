package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace4\\Frames\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://retail.onlinesbi.com/retail/login.htm");
	WebElement btnClk = driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']"));
    btnClk.click();
  //  driver.switchTo().frame("col-lg-6 col-md-6 col-sm-6 user_details");
    WebElement btnClk2 = driver.findElement(By.id("Button2"));
    btnClk2.click();
     Alert alert = driver.switchTo().alert();
     alert.accept();
     
}
}

