package day1.Var_Datatype_Typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		// byte to int
		byte b=127;
		int a=b;
		System.out.println(a);
		
		// int into byte
		int c=258;
		byte d=(byte) c;      //number%256
		System.out.println(d);
		
		
		// float into int
		float e=9.7f;
		int f=(int) e;
		System.out.println(f);
		
		
		
		//
		byte g=10;
		byte h=30;
		int result=g*h;
		System.out.println(result);
		
	}

}
