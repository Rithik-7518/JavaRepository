package day4.ExceptionHandling;

class RithikException extends Exception{
	public RithikException(String str){
		super(str);
	}
}

public class CustomException {
	
	public static void main(String[] args) {
		int a=20;
		int b = 0;
		
		try {
			b=7/a;
			if (b==0)
				throw new RithikException("i don't want to print 0");
		}
		catch(RithikException e) {
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
