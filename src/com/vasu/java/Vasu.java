package com.vasu.java;

public class Vasu
{
//variables
	int k=30;
	
	//methods
	public void add()
	{
		int a=80;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		//object
		Vasu v=new Vasu();
		v.add();
		System.out.println(v.k);
	}
}
