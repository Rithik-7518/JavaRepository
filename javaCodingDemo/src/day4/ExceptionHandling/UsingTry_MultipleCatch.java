package day4.ExceptionHandling;

public class UsingTry_MultipleCatch {

	public static void main(String[] args) {
		int a=2;
		int b = 0;
		int nums[]=new int[5];
		String str=null;
		try {
			b=7/a;
			System.out.println(b);
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divid by zero");
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("stay with in array limit");
		}*/
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}
		
		//System.out.println(b);
		
		System.out.println("hello");
	}

}
