package day4.AbstractKeyword;

abstract class Car {
	public abstract void drive();
	public abstract void fly();
	public void playMusic() {
		System.out.println("play music");
	}
}

abstract class Thar extends Car{
	public void drive() {
		System.out.println("driving....");
	}
}

class UpdatedThar extends Thar{

	
	public void fly() {
		System.out.println("flying...");
	}
	
}




public class Abstract {

	public static void main(String[] args) {
		Car obj = new UpdatedThar();
		obj.drive();
		obj.playMusic();
		obj.fly();
	}

}
