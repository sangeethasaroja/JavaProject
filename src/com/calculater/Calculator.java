package com.calculater;

import java.util.Scanner;

public class Calculator {
public static void add(int a,int b)
{
	int c=a+b;
  System.out.println("addition :"+c);
}
public static void sub(int a,int b)
{
	int c=a-b;
  System.out.println("subtraction :"+c);
}
public static void mul(int a,int b)
{
	int c=a*b;
  System.out.println("multiplication :"+c);
}
public static void div(int a,int b)
{
	int c=a/b;
  System.out.println("divition :"+c);
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter two integer number");
			int a=scan.nextInt();
			int b=scan.nextInt();
		System.out.println("enter your option :1.add\n2.sub\n3.mul\n4.div\n5.exit");
		int ch=scan.nextInt();
		switch(ch)
		{
		case 1:add(a,b);break;
		case 2: sub(a,b);break;
		case 3:mul(a,b);break;
		case 4: div(a,b);break;
		case 5:System.exit(0);break;
		default :System.out.println("invalid option");
		}
		}
	}

}
