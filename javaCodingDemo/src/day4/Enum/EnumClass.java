package day4.Enum;

enum Laptop{
	HP(90000),DELL(80000),Lenovo,MacBook(100000);
	
	private int price;
	

	private Laptop() {
		price=70000;
	}

	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class EnumClass {

	public static void main(String[] args) {
		
		
		//error
		//Laptop lap=new Laptop.Lenovo;
		//System.out.println(lap);
		
		for(Laptop lap: Laptop.values()) {
			System.out.println(lap+":"+lap.getPrice());
		}
		
		
		
	}

}
