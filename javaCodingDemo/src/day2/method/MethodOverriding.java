package day2.method;

class X{
	public int add(int a,int b) {
		return a+b;
	}
	
}

class  Y extends X{
	public int add(int a,int b) {
		return a+b+1;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Y obj=new Y();
		int r1=obj.add(12, 45);
		System.out.println(r1);
		
	}

}
