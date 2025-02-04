package day3.AnonymousObject;

class A{
	public A() {
		System.out.println("from A Constructor");
	}
	public void show() {
		System.out.println("From class A");
	}
}

public class AnonymousObjectDemo {

	public static void main(String[] args) {
		new A().show();		// anonymous object
	}

}
