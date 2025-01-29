package day9;

interface Shape{
	int length=7;
	int width=18;
	
	void circle();     // abstract method
	
	default void square() 
	{
		System.out.println("this is square");
	}
	
	static void rectangle() {
		System.out.println(" this is rectangle");
	}
}

public class InterfaceDemo implements  Shape{
	
	public void circle() {
		System.out.println("this is circle");
	}
	void triangle() {
		System.out.println("this is triangle");
	}

	public static void main(String[] args) {

		InterfaceDemo iobj =new InterfaceDemo();
		iobj.circle();   // abstract
		iobj.square();   // defualt
		Shape.rectangle();  // static
		iobj.triangle();
		
		Shape sh=new InterfaceDemo();   // shape is interface name and InterfaceDemo is class name
		sh.circle();
		sh.square();
		Shape.rectangle();
		
	}

}
