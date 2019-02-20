package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("HttP://google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_P")).click();
		//capturing the Title
		String title=driver.getTitle();
		System.out.println(title);
		//capturing the url
		System.out.println(driver.getCurrentUrl());
		//navigate back
		driver.navigate().back();
		//capturing the Title
		String title1=driver.getTitle();
		System.out.println(title1);
		//capturing the url
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
