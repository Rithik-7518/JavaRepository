package day8;

//overloading --> change declaration , may or may not change implementation --> ploymorphism concept
//overriding --> change only implementation --> inheritance concept 

class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	void m1(int a) // overriding
	{
		System.out.println(a*a);
	}
	void m2(int a,int b) // overloading
	{
		System.out.println(a+b);
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {

		
		XYZ xyzobj =new XYZ();
		xyzobj.m1(7);
		xyzobj.m2(18);
		xyzobj.m2(45, 8);
	}

}
