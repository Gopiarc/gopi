package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace4\\Frames\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		WebElement btnUser = driver.findElement(By.name("fldLoginUserId"));
		btnUser.sendKeys("gopi123");
		WebElement btnContinue = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		btnContinue.click();
		//  driver.switchTo().frame(0);
		Thread.sleep(4000);
		WebElement txtPass = driver.findElement(By.name("fldPassword"));
		txtPass.sendKeys("gopi321");
		// WebElement btTick = driver.findElement(By.name("chkrsastu"));
		//  btTick.click();
		// Thread.sleep(2000);
		// WebElement a = driver.findElement(By.xpath("(//frameset[@border='false'])[1]"));
		// driver.switchTo().frame(a);
		WebElement clLogin = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		clLogin.click();
	}
}
