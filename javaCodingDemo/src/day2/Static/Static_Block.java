package day2.Static;

class mobile1{
	String brand;
	int price;
	String model;
	static String Os;
	
	static {
		Os="android";
		System.out.println("from static block");
	}
	
	public mobile1() {
		brand="";
		price=1000;
		model="";
		System.out.println("from constructor");
	}
	
	public void print() {
		System.out.println(brand + "," +model +"," +price+","+Os);
	}
}


public class Static_Block {

	public static void main(String[] args) {
		
		mobile1 m1= new mobile1();
		/*m1.brand="OPPO";
		m1.price=15000;
		m1.model="A59";
		mobile.Os="android";
		*/
		mobile1 m2= new mobile1();
			}

}
