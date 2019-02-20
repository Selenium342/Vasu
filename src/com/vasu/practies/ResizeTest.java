package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement rs=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		Actions resize=new Actions(driver);
		//resize.clickAndHold(rs).moveByOffset(100, 200).release(rs).build().perform();
		resize.dragAndDropBy(rs, 100, 200).build().perform();
		

	}
}
