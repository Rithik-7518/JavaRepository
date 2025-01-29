package day5;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		// creating string 
		// method 1
		
		//String y="Hello";
		
		// method 2
		String s=new String ("Hello");
		
		// length() method
		//----->find length of string 
		System.out.println(s.length());
		System.out.println("HI".length());
		
		
		// concat() method 
		//----> join two or more string
		String s1 ="hello";
		String s2=" rithik";
		String s3=" ,hi";
		
		//System.out.println(s2.length());
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		System.out.println("hello".concat(" Rithik"));
		
		
		
		// trim() method
		//-----> remove space in string
		
		s="   Rithik    ";
		System.out.println(s);    //   Rithik  
		System.out.println("before trim length:"+s.length());    // before trim length:13
		System.out.println(s.trim());   // Rithik
		System.out.println("after trim length:"+s.trim().length());  //		after trim length:6
		
		
		//charAt() method ----> return a character from a string based on index
		s="rithik";
		System.out.println(s.charAt(4));   // i
		
		
		// contains() method 
		//---->contain method find the given word/letters found in original string or not in sequence order
		//----> even change in uppercase / lowercase also return false 
		//----> return true / false
		
		System.out.println(s.contains("ith"));   // true
		System.out.println(s.contains("Ith"));   // false
		
		
		// equals() , equalIgnoreCase() method
		//-----> check the two are same or not 
		//-----> return true or false
		//----> even change in uppercase / lowercase also return false
		// ---> if you need to ignore casesentitive use equalIgnorecase()
		
		String s4="rithik";
		String s5="rithik";
		String s6="Rithik";
		System.out.println(s4==s5);  // true
		System.out.println(s4.equals(s5));  // true
		System.out.println(s4==s6);    // false
		
		System.out.println(s4.equalsIgnoreCase(s6));   // true
		
		// replace() method 
		// ----> replace single or multiple (sequence) of character in string
		
		s="hello,rithik. how are you?";
		System.out.println(s.replace('h', 'd'));   //dello,ritdik. dow are you?
		System.out.println(s.replace("rithik", "msd"));  //hello,msd. how are you?
		
		//substring() method
		//----->extract substring from string 
		// -----> based on index
		s="rithik";
		System.out.println(s.substring(2, 4));    // th
		System.out.println(s.substring(0, 4));    // rith
		
		
		
		// toUpperCase() and toLowercase() method
		s="Rithik";
		System.out.println(s.toUpperCase());   // RITHIK
		System.out.println(s.toLowerCase());   // rithik
		
		
		//split() method --->split the string into multiple part based on delimeter
		s="rithik123@gmail.com";
		String a[]=s.split("@");  
		System.out.println(a[0]);  // rithik123
		System.out.println(a[1]);   // gmail.com
		System.out.println(Arrays.toString(a));  // [rithik123, gmail.com]
		
		
		// some examples
		s="$34,$12,$123";
		System.out.println(s.replace("$","").replace(",",""));   // 3412123
		
		// eg
		s="abd,123@xyz";
		String ab[]=s.split(",");
		System.out.println(Arrays.toString(ab));   // [abd, 123@xyz]
		
		String ab1[]=ab[1].split("@");
		System.out.println(Arrays.toString(ab1));   // [123, xyz]
		
		System.out.println(ab[0]);  // abd
		System.out.println(ab1[0]); // 123
		System.out.println(ab1[1]); // xyz
		
		
		// eg
		s="rithik msd";
		System.out.println(s.replace('r','R').contains("Rithik"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
