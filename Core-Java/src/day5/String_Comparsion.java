package day5;

public class String_Comparsion {

	public static void main(String[] args) {

		// create a string without new keyword
		/*
		String s1="rithik";
		String s2="rithik";
		
		System.out.println(s1==s2);        // true
		System.out.println(s1.equals(s2)); //true
		*/
		
		
		// create a string with new keyword
		
		String s1=new String("rithik");
		String s2=new String("rithik");
		System.out.println(s1);  // rithik
		System.out.println(s2);  // rithik
		
		// double equal used to compare the objects
		System.out.println(s1==s2);        // false
		// equals used to compare values of objects 
		System.out.println(s1.equals(s2)); // true
		
		
		/*
		String s1="rithik";
		String s2=new String("rithik");
		System.out.println(s1==s2);         // false
		System.out.println(s1.equals(s2));  // true
		*/
		/*
		String s1="rithik";
		String s2=new String("rithik");
		String s3=s2;
		System.out.println(s1==s2);         // false
		System.out.println(s1.equals(s2));  // true
		
		System.out.println(s2==s3);         // true
		System.out.println(s2.equals(s3));  // true
		
		System.out.println(s1==s3);         // false
		System.out.println(s1.equals(s3));  // true
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
