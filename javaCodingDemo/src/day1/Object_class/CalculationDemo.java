package day1.Object_class;

public class CalculationDemo {

	
	public int add(int a,int b) {
		int c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		int a=7;
		int b=18;
		int z;
		
		CalculationDemo cd=new CalculationDemo();
		
		z=cd.add(a, b);
		System.out.println("addition of a and b is : "+z);
		
		//System.out.println("addition of a and b is : "+cd.add(a, b));
		
		
		
	}

}
