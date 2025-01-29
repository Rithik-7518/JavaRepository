package day10;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {

		
		System.out.println("program is started");
		Scanner sc =new Scanner(System.in);
		
		// Arthimetic exception
		System.out.println("enter a number");
		int num=sc.nextInt();    //providing 0 show this exception
		
		try {
		System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data");
		}
		
		System.out.println("Program is completed");
		System.out.println("program is exited");
		
	}

}
