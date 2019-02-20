package com.vasu.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest 
{

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
@Test
public void method1()
{
	System.out.println("AppLogin");
}
/*@Test
public void method2()
{
	System.out.println("BranchCreation");
}*/

@BeforeTest
public void before()
{
	System.out.println("appLaunch");
}
@AfterTest
public void after()
{
	System.out.println("appClose");
}
}
