package day5;

public class String_Vs_StringBuffer_Vs_StringBuilder {

	public static void main(String[] args) {

		// string --->immuable --- cannot change the value
		
		String s=new String("rithik");
		s.concat("how are you");
		System.out.println(s);   // rithik
		
		
		// StringBuffer --> mutable --- can change the value

		StringBuffer sb=new StringBuffer ("rithik");
		sb.append(" how are you");
		System.out.println(sb);    // rithik how are you
		
		
		// StringBuilder --> mutable --- can change the value
		StringBuilder sb1 =new StringBuilder("rithik");
		sb1.append(" how are you");
		System.out.println(sb1);    // rithik how are you
		
		
		
		
		
		
		
		
	}

}
