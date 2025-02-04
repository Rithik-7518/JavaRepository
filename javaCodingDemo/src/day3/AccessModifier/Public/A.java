package day3.AccessModifier.Public;

class launch{
	public void abc() {
		A obj=new A();
		System.out.println(obj.age);
	}
}


public class A{
	//public int marks =95;
	
	protected int age=21;
}


