package day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		
		System.out.println("program is started");
		System.out.println("program is exceted");
		
		Thread.sleep(2000);
		
		
		FileInputStream file =new FileInputStream("c:\\text.txt");
		
		/*try {
		Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
		}*/
		
		System.out.println("program is finished ");
		System.out.println("program is testing");
		
		
		
		/*
		 * types of exception
		 * 1. checked --- identify by java compiler
		 *  eg : Interrupted Exception , FileNotFound 
		 *  handled by try and catch block  ,  throws block
		 *  throws is used method level
		 *  
		 *  
		 *  
		 * 2. unchecked -- not identify by java compiler 
		 * eg: Arithmetic , NullPointer 
		 * handles by only try and catch block
		 */
		
	}

}
