package taking_input_keyboard;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {

		// taking single value
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		// getting double input ---> double i=sc.nextDouble();
		
		
		System.out.println("entered number is:"+num);
		
		// multiple input
		System.out.println("enter the number 1:");
		int num1=sc.nextInt();
		System.out.println("entered number 1 is:"+num1);
		
		
		System.out.println("enter the number 2:");
		int num2=sc.nextInt();
		System.out.println("entered number 2 is:"+num2);

		System.out.println("addition num1 and num2 is:"+ (num1+num2));
		
		// different data type input
		System.out.println("enter unknown input:");
		Object i=sc.next();
		System.out.println(i);
		
	}

}
