package com;

public class Calculator
{
	public int add(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
		return a+b;
	}
	public int sub(int a,int b)
	{
		System.out.println("Subtraction : "+(a-b));
		return a-b;
	}
	public int mul(int a,int b)
	{
		System.out.println("Multiplication : "+(a*b));
		return a*b;
	}
	public int div(int a,int b)
	{
		System.out.println("Division : "+(a/b));
		return (int)(a/b);
	}


}
