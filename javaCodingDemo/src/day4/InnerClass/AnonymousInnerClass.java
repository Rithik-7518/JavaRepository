package day4.InnerClass;

class X{
	public void show() {
		System.out.println("in X show");
	}
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		X obj = new X() {
			public void show() {
				System.out.println("in new show");
			}
		};
		obj.show();
		
		
	}

}
