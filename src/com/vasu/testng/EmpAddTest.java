package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpAddTest extends OrangeHRM
{
@Test
public void empAdd()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Vasu45363");
	driver.findElement(By.id("lastName")).sendKeys("Vasu45363");
	driver.findElement(By.id("btnSave")).click();
	
}
}
