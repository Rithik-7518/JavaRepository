package day3.FinalKeyWord;


class Calc{
	public void show() {
		System.out.println("in Calc show");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

class AdvCalc extends Calc{
	public void show() {
		System.out.println("in AdvCalc show");
	}
}


public class FinaClass {

	public static void main(String[] args) {
		AdvCalc obj=new AdvCalc();
		obj.show();
		obj.add(8,7);
	}

}
