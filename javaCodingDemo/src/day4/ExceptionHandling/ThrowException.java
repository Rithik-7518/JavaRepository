package day4.ExceptionHandling;

public class ThrowException {

	public static void main(String[] args) {
		int a=20;
		int b = 0;
		
		try {
			b=7/a;
			if (b==0)
				throw new ArithmeticException("i don't want to print 0");
		}
		catch(ArithmeticException e) {
			b=7/1;
			System.out.println("default output "+e);
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
		
		System.out.println(b);
		
		System.out.println("hello");
	}

}
