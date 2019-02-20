package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiTest {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.shadi.com/");
		driver.manage().window().maximize();
		
		Select month=new Select(driver.findElement(By.id("dob_m")));
		month.selectByIndex(4);
		Select day=new Select(driver.findElement(By.id("dob_d")));
		day.selectByIndex(4);
	}

}
