package day2.Static;

class mobiles{
	String brand;
	int price;
	String model;
	static String Os;
	
	public void print() {
		System.out.println(brand + "," +model +"," +price+","+Os);
	}
	
	public static void show() {
		System.out.println("method is from static method");
	}
	public static void show1(mobiles obj) {
		System.out.println(obj.brand + "," +obj.model +"," +obj.price+","+Os);
	}
}


public class Static_Method {

	public static void main(String[] args) {
		
		mobiles m1= new mobiles();
		m1.brand="OPPO";
		m1.price=15000;
		m1.model="A59";
		mobiles.Os="android";
		
		mobiles m2= new mobiles();
		m2.brand="Realme";
		m2.price=13000;
		m2.model="c20";
		mobiles.Os="android";
		
		m1.print();
		m2.print();
		mobiles.show();
		mobiles.show1(m2);
	}

}
