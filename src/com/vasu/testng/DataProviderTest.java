package com.vasu.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest
{

@DataProvider
public Object[][] testdata()

{
	Object [][] data=new Object[2][2];
	
	data[0][0]="vasu";
	data[0][1]="Sai";
	data[1][0]="Vasu1";
	data[1][1]="Sai1";
	
	return data;
}
@Test(dataProvider="testdata")
public void sample(String s1,String s2)
{
	System.out.println(s1+"---"+s2);
}
}
