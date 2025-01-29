package day11;


class parent{
	String name="rithik";
	void m1() {
		System.out.println("this is m1 from parent");
	}
	
}
class child extends parent
{
	int id =7;
	void m2() {
		System.out.println("this is m2 from child");
	}
}
public class TypeCastingObj1 {

	public static void main(String[] args) {

		
		child c=new child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		/*
		parent p=new child(); // upcasting 
		System.out.println(p.name);
		p.m1();
		System.out.println(p.id);  // we cannot access
		p.m2();   // we cannot access 
		*/
		
		
		
		
		
	}

}
