package com.vasu.java;

public class ValidationTest {

	public static void main(String[] args)
	{
		/*String data="Selenium";
		String data1="Selenium";
		
		if (data.equals(data1))
		{
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}*/
		String data="Vasu Selenium";
		String data1="Venkat";
		if (data.contains(data1))
		{
			System.out.println("exist");
		}else
		{
			System.out.println("Not exist");
		}

	}

}
