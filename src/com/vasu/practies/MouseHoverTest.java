package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://ceoandhra.nic.in/home.aspx");
		driver.manage().window().maximize();
		WebElement pdf=driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[3]/a"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(pdf).build().perform();
		

	}

}
