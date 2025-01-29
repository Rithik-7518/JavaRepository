package day6;

public class ConstructorDemo {

	int x,y;
	
	// default constructor
	ConstructorDemo(){
		x=100;
		y=200;
		
	}
	
	// parameterized constructor
	ConstructorDemo(int a, int b){
		x=a;
		y=b;
		
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {

		ConstructorDemo add1=new ConstructorDemo();  // default constructor 
		add1.sum();
		
		ConstructorDemo add =new ConstructorDemo(10,20); // parameterized constructor
		add.sum();
		
		
	}

}
