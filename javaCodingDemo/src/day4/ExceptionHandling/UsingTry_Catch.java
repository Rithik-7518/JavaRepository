package day4.ExceptionHandling;

public class UsingTry_Catch {

	public static void main(String[] args) {
		int a=2;
		//int b=7/a;
		double b = 0;
		
		try {
			b=7/a;
			
		}catch(Exception e) {
			System.out.println("something went wrong"+e);
		}
		
		
		System.out.println(b);
		
		System.out.println("hello");
	}

}
