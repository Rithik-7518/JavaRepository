package day5;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {

		// mutable------->change the array element
		int a[]= {20,10,40,30};
		System.out.println("before sorting of array:"+Arrays.toString(a));
		Arrays.sort(a);    //----> mutable
		System.out.println("before sorting of array:"+Arrays.toString(a));

		
		
		// immutable------> not change the original value
		String s=new String("rithik");
		System.out.println(s); // rithik
		s.concat("how are you");
		System.out.println(s);  // rithik
		
		// for concat 
		String s1=s.concat("how are you");
		System.out.println(s1);     // rithikhow are you
		
		
		
		
		
		
		
		
		
		
	}

}
