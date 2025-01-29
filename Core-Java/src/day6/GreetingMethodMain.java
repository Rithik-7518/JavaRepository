package day6;

public class GreetingMethodMain {

	public static void main(String[] args) {

		
		GreetingMethod gr=new GreetingMethod();
		gr.m1(); //1)
		
		String s=gr.m2();
		System.out.println(s);  // 2)
		
		gr.m3("dhoni");  // 3)
		
		String s1=gr.m4("virat");
		System.out.println(s1);
	}

}
