package day3.Casting;
class X{
	public void show1() {
		System.out.println("in A show");
	}
}

class Y extends X{
	public void show2() {
		System.out.println("in B show");
	}
}
public class DownCasting {

	public static void main(String[] args) {
		
		// upcasting
		X obj= new Y();
		obj.show1();
		
		//into downcasting
		Y obj2=(Y)obj;
		obj2.show2();
		
	}

}
