package day3.Constructor;

class Data1{
	
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Data1() {
		age=20;
		name="msd";
	}
	
	public Data1(int a,String n) {
		age=a;
		name=n;
	}
	
	
	
}


public class ConstructorParameterized {

	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data1 d2=new Data1(18,"vk");
		
		System.out.println(d1.getName()+":"+d1.getAge());
		System.out.println(d2.getName()+":"+d2.getAge());
		
		
		
	}

}
