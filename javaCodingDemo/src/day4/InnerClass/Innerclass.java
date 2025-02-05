package day4.InnerClass;


class A{
	int age;
	public void show() {
		System.out.println("in show");
	}
	static class B{
		public void config() {
			System.out.println("in config");
		}
	}
}
public class Innerclass {

	public static void main(String[] args) {
		
		A obj =new A();
		obj.show();
		
		
		// calling inner class
		A.B obj1=new A.B();
		obj1.config();
		
	}

}
