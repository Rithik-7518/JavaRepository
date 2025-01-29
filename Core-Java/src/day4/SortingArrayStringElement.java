package day4;

import java.util.Arrays;

public class SortingArrayStringElement {

	public static void main(String[] args) {

		// char sorting
		//char a[]= {'r','i','t','h','i','k'};
		
		// string sorting
		String a[]= {"Rithik","Jamuna","Parthiban","Amudhan"};
		System.out.println("before sorting of array"+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting of array"+ Arrays.toString(a));

		
		
	}

}
