package day4.ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try {
			j=10/i;
			System.out.println(j);
		}catch(Exception e) {
			System.out.println("something went wrong "+e);
		}
		finally {
			System.out.println("hello");
		}
		
	}

}
