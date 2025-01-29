package wrapper_demo;

public class DataConversionMethod {

	public static void main(String[] args) {
		
		
		//String s="Dhoni";  // cannot convert to int
		
		/*
		 * String-----> int
		String s1="7";
		String s2="18";
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2) );
		*/
		
		/*
		 *  string --> double
		 
		String s1="7.5";
		String s2="18.5";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		/*
		 *  String---> boolean
		 *  other than true it return false
		
		String s="tru";
		System.out.println(Boolean.parseBoolean(s));
		*/
		
		
		
		
		// int,double,char,boolean ---> string
		
		int i=18;
		double d=7.5;
		char c='A';
		boolean bool=true;
		
		String si=String.valueOf(i);
		String sb=String.valueOf(bool);
		String sc=String.valueOf(c);
		String sd=String.valueOf(d);
		
		System.out.println(si);
		System.out.println(sb);
		System.out.println(sc);
		System.out.println(sd);
		
		
		
		
	}

}
