package day3.Inheritance;






public class InheritanceDemo {

	public static void main(String[] args) {
		/*
		Calc obj= new Calc();
		int r1=obj.add(15, 7);
		int r2=obj.sub(18,3);
		System.out.println(r1);
		System.out.println(r2);
		*/
		
		/*AdvCalc obj1=new AdvCalc();
		int r1=obj1.add(7, 45);
		int r2=obj1.sub(18, 45);
		int r3=obj1.mul(5,7);
		int r4=obj1.div(30, 3);
		*/
		
		VeryAdvCalc obj1=new VeryAdvCalc();
		int r1=obj1.add(7, 45);
		int r2=obj1.sub(18, 45);
		int r3=obj1.mul(5,7);
		int r4=obj1.div(30, 3);
	    double r5=obj1.power(4, 2);
		
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		
		
	}

}
