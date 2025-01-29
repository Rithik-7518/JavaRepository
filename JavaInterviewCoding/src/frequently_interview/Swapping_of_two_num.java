package frequently_interview;

public class Swapping_of_two_num {

	public static void main(String[] args) {

				
		int a=10, b=5;
		System.out.println("before swapping values a is " +a +" and b is "+b );
		
		// swapping two number using third variable
		/*
		int t=a;   // t values is 10
		a=b;		// a value is 5
		b=t;		// b value is 10 
		*/
		
		// using addition and minus operation
		/*
		a=a+b;  // 10+5= 15 --> a
		b=a-b;  // 10-5= 05 --> b
		a=a-b;  // 15-5= 10 --> a
		
		
		
		// using * and / operations ** note ----> a and b values not zero  **
		/*
		a=a*b;  // 10*5 = 50 ---> a
		b=a/b;  // 50/5 = 10 ---> b
		a=a/b;  // 50/10= 05 ---> a
		*/
		
		// swapping in single line or statement
		
		b=a+b-(a=b);
		// done by BODMAS rule
		
		
		
		
		System.out.println("after swapping values a is " +a +" and b is "+b );

		
		
		
				
		
		
	}

}
