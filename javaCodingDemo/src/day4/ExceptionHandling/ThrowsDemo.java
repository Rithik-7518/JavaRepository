package day4.ExceptionHandling;

class A{
	public void show() throws ClassNotFoundException {
		
			Class.forName("A");
		
	}
}

public class ThrowsDemo {

	
	public static void main(String[] args) {
		A obj = new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
