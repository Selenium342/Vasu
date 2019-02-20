package com.vasu.excel;

public class MethodsTest
{

	public void add()
	{
		int a=30;
		int b=40;
		int sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		MethodsTest v=new MethodsTest();
		v.add();//calling method by using method name //it won't return any value
		//int res=v.add();// calling method with variable //it return a value
		//System.out.println(res);
		//System.out.println(v.add(50,20));
	}

}
