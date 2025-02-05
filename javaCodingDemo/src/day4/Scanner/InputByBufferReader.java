package day4.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputByBufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num=0;
		System.out.println("enter the number");
		
		
		
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			
			num=Integer.parseInt(br.readLine());
			System.out.println("entered number is : "+num);
		
	}

}
