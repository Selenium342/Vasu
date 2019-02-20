package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleTestNg 
{
	FirefoxDriver driver;
@Test()
public void appLaunch()
{
	driver=new FirefoxDriver();
	driver.get("Http://Primusbank.qedgetech.com");
	driver.manage().window().maximize();
	//
}
@Test()
public void appLogin()
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");

	driver.findElement(By.id("login")).click();
}
@Test(priority=1)
public void appClose()
{
	driver.close();
}

}
