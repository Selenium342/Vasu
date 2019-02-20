package com.vasu.java;

import java.util.Scanner;

public class IfStatement
{
	public static void main(String[] args)
	{
		// to check the given no is even/odd  number
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		if (n%2==0)
		{
			System.out.println("Even No");
		}else
		{
			System.out.println("Odd No");
		}

	}

}
