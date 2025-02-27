package day4.Scanner;

import java.util.Scanner;

public class AskingInput {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("entered number is : "+num);
		
	}

}
