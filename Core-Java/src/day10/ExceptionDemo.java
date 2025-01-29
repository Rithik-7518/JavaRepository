package day10;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("program is started");
		Scanner sc =new Scanner(System.in);
		
		/*
		 * Arthimetic exception
		System.out.println("enter a number");
		int num=sc.nextInt();    //providing 0 show this exception
		System.out.println(100/num);
		*/
		
		/*
		 * ArrayIndexOutofBound
		 */ 
		int a[]= new int[5];
		System.out.println("enter the position(0-4)");
		int po=sc.nextInt();
		System.out.println("enter the value");
		int value=sc.nextInt();
		
		a[po]=value;
		System.out.println(a[po]);
		
		
		
		 /* numberFormatException
		  
		String s= "wertyu";
		int num=Integer.parseInt(s);
		System.out.println(num);
		*/
		
		
		/* nullPointerException
		String s1= null;
		System.out.println(s1.length());
		*/
		
		
		System.out.println("Program is completed");
		System.out.println("program is exited");
	}

}
