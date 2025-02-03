package day2.String;

public class StringBuffer_Builder {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Rithik");
		sb.append(" S");
		
		//sb.deleteCharAt(7);
		sb.insert(0, "Hello ");
		sb.setLength(20);
		
		System.out.println(sb);
		
		
		
	}

}
