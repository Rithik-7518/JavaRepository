package day3.ObjectClass;

class laptop{
	 String model;
	 int price;
	 
	 public String toString() {
		 return model+":"+price;
	 }
	 
}


public class Object {

	public static void main(String[] args) {
		laptop obj = new laptop();
		obj.model="HP";
		obj.price=90000;
		System.out.println(obj);
	}

}
