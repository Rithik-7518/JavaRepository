package day1.Var_Datatype_Typecasting;

public class Literals {

	public static void main(String[] args) {
		int a=24;
		
		//binary
		int b=0b101;  //  .... 64 16 8 4 2 1 
		System.out.println(b);  // 5
		
		// hexadecimal
		int  c =0x7E;    //126
		
		
		// easy to count number
		int d=1_00_000;   // 100000
		
		// int number to to float
		double e=17;    //17.0
		
		//double
		double f=12e10;   //120000000000 value in num 
							//o/p---1.2E11
		
		// charater
		char g='r';
		System.out.println("before ++ operation value in g is : "+g);
		g+=2;
		System.out.println("after ++ operation value in g is: "+g);
		
		//System.out.println(f);  
		
		
	}

}
