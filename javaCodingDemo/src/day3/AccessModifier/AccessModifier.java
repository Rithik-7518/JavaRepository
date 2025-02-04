package day3.AccessModifier;

import day3.AccessModifier.Public.A;
class c extends A{
	public void abc() {
		System.out.println(age);
	}
	
}
public class AccessModifier {

	public static void main(String[] args) {
		c obj1=new c();
		//System.out.println(obj.marks);
		obj1.abc();
		
		//B obj1=new B();
		//System.out.println(obj1.marks);
	}

}
