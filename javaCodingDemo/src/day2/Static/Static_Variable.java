package day2.Static;

class mobile{
	String brand;
	int price;
	String model;
	static String Os;
	
	public void print() {
		System.out.println(brand + "," +model +"," +price+","+Os);
	}
}


public class Static_Variable {

	public static void main(String[] args) {
		
		mobile m1= new mobile();
		m1.brand="OPPO";
		m1.price=15000;
		m1.model="A59";
		mobile.Os="android";
		
		mobile m2= new mobile();
		m2.brand="Realme";
		m2.price=13000;
		m2.model="c20";
		mobile.Os="android";
		
		m1.print();
		m2.print();
	}

}
