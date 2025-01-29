package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandwritingArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {


		int r[]=new int[4];
		
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<r.length;i++) {
			System.out.println("enter the values for array create for position "+i+" :");
			r[i]= sc.nextInt();
			
		}
		
		System.out.println("printing array elements:" + Arrays.toString(r));
	}

}
