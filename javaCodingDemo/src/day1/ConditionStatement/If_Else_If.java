package day1.ConditionStatement;

public class If_Else_If {

	
	// greatest number in 3 given numbers
	
	
	public static void main(String[] args) {
		int a,b,c;
		a=5;
		b=7;
		c=10;
		
		if(a>b && a>c) {
			System.out.println("a is greatest number");
		}
		else if (b>a && b>c) {
				System.out.println("b is greatest number");
			}
		
		else {
				System.out.println("c is greatest number");
		}
	}

}
