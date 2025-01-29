package day7;

public class AdderMain {

	public static void main(String[] args) {

		
		Adder addobj=new Adder();
		addobj.sum();   //1
		
		addobj.sum(100, 200);   //2
		
		addobj.sum(10.5, 7);   //4
		
		addobj.sum(7,18.0);    //3
		
		addobj.sum(7, 18, 45);    //5
		
		
		
	}

}
