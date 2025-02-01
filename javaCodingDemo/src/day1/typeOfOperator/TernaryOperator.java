package day1.typeOfOperator;

public class TernaryOperator {

	
	// number is odd or even
	
	public static void main(String[] args) {

		int x;
		x=23465868;
		String y;
		
		
		
		/*without using ternary operator
		 * 
		 * 
		if(x%2==0)
			System.out.println("x is even number");
		else
			System.out.println("x is odd number");
		*/
		
		String a="even",b="odd";
		y= x%2==0 ? a : b;
		System.out.println(y);
		
		
	}

}
