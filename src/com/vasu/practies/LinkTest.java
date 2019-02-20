package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		//capturing all links by using tagName
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++)
		{
			//System.out.println(links.get(i).getText());
			/*if (!links.get(i).getText().isEmpty()) 
			{
				System.out.println(links.get(i).getText());
			}*/
			if (links.get(i).getText().equals("New User Register")) 
			{
				links.get(i).click();
				break;
			}
			//break;
		}

	}

}
