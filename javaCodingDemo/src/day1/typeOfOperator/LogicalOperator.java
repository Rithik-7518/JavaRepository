package day1.typeOfOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		boolean z,g;
		
		// and
		//z= x>y && a<b;
		
		
		//or 
		z= x>y || a<b;
		System.out.println(z);
		
		//not
		g=!z;
		
		System.out.println(g);
		
		
		
	}

}



/* and 
	T T -> T
	T F -> F
	F T -> F
	F F -> F

*/


/* OR
	T T -> T
	T F -> T
	F T -> T
	F F -> F
*/
