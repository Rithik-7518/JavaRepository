package day4.Abstract_Anonymous;

abstract class A{
	abstract public void show();
	abstract public void config();
	
}


public class Abstract_Anonymous {

	public static void main(String[] args) {
		A obj =new A() {
			public void show() {
				System.out.println("in A show ");
			}

			public void config() {
				System.out.println("in config");
			}
		};
		obj.show();
		obj.config();
	}

}
