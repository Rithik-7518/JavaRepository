package day5;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		
		// reverse string using ----> length() and concat()
		
		String s="rithik";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			//System.out.println(s.charAt(i)); 
			// k
			// i
			// h
			// t
			// i
			// r
			
			r=r+s.charAt(i);
			
		}
		System.out.println("reverse string is:"+r);
		
		
		
		// reverse string --->by converting string to char array type 
		/*String s="rithik";
		String r="";
		
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));		// [r, i, t, h, i, k]
		
		for( int i=a.length-1;i>=0;i--)	{
			//System.out.println(a[i]);
			// k
			// i
			// h
			// t
			// i
			// r
			r=r+a[i];
			
		}
		
		System.out.println("reserved string is:"+r );
		*/
		
		
		// reverse string using stringBuffer class
		/*StringBuffer s=new StringBuffer("rithik");
		System.out.println(s.reverse());
		*/
		
		
		// reverse string using stringBuilder class
		/*StringBuilder s=new StringBuilder ("rithik");
		System.out.println(s.reverse());
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
