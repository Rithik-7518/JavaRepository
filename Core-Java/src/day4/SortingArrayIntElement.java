package day4;

import java.util.Arrays;

public class SortingArrayIntElement {

	public static void main(String[] args) {

		int a[]= {8,3,18,45,7};
		
		System.out.println("Before sorting of array ");
		
		/*
		for(int x:a) {
			System.out.println(x);
		}*/
		
		// to only print the array element we can use the below code
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("after sorting of array ");
		System.out.println(Arrays.toString(a));

		
	}

}
