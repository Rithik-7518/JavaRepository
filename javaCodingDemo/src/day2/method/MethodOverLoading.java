package day2.method;

public class MethodOverLoading {

	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b ,int c) {
		return a+b+c;
	}
	public double add(double a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		MethodOverLoading mo=new MethodOverLoading();
		int z=mo.add(7,18,45);
		System.out.println(z);
		
		
	}

}
