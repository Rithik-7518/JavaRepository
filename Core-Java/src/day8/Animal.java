package day8;

public class Animal {

	String color ="black";
	void eat() {
		System.out.println("Eating...");
	}
}
class dog extends Animal{
	String color= "red";
	void display()
	{
		System.out.println(super.color);
	}
	void eat() {
		//System.out.println("eating food.....");
		super.eat();
	}
}