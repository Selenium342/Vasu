package com.vasu.practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://hdfcbank.com");
		driver.manage().window().maximize();
		//homepage
		String parent=driver.getWindowHandle();
		//System.out.println(parent);
		driver.findElement(By.id("loginsubmit")).click();
		
		//capturing all window id's
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> it=windows.iterator();
				while(it.hasNext())
				{
					String child=it.next().toString();
					driver.switchTo().window(child);
					driver.close();
				}
				/*//System.out.println(child);
				for (String child : windows) 
				{
					//System.out.println(child);
					//driver.switchTo().window(child);
					//driver.close();
					if (!parent.equals(child)) 
					{
						driver.switchTo().window(child);
						driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
					}
				}*/
	}

}
