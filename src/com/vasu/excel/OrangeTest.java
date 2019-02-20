package com.vasu.excel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeTest 
{
	public FirefoxDriver driver;
	String res;
//appLaunch
	public String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//validate
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("welcome")).isDisplayed())
		{
			res="Pass";
			
		}else
		{
			res="Fail";
			
		}
		return res;
	}
	//branchcreation
	public String branchCreation(String branchName,String add1) throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		//validation
		if (msg.contains("created Sucessfully"))
		{
			System.out.println("BranchCreated Successfully");
		}else if(msg.contains("already Exist"))
		{
			System.out.println("BranchCreation Failed");
		}else if(msg.contains("Please fill in"))
		{
			//System.out.println("Warning ");
			res="warning";
		}
	
		
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	return res;
	}
	public static void main(String[] args)
	{
		OrangeTest app=new OrangeTest();
		//app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		System.out.println(results);
		String results1=app.appLogin("Admin", "Qedge123!@#");
		System.out.println(results1);
	}
}
