package day4.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryBlockFeatures {

	public static void main(String[] args) throws IOException {
		
		int num=0;
		System.out.println("enter the number");
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			num=Integer.parseInt(br.readLine());
			System.out.println("entered number is : "+num);
		} 
	}

}
