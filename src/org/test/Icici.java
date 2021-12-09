package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace4\\Frames\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
//driver.switchTo().frame("Revamp_Banner_ID");
WebElement txtUser = driver.findElement(By.name("DUMMY1"));
txtUser.sendKeys("gopi123");
WebElement clkUserGo = driver.findElement(By.id("user-id-goahead"));
clkUserGo.click();
WebElement txtPass = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
txtPass.sendKeys("gopi");
WebElement clkLogIn = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
clkLogIn.click();
Alert al = driver.switchTo().alert();
al.accept();
	
	}
}