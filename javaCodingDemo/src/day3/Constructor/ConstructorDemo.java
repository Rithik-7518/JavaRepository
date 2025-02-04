package day3.Constructor;

class data{
	
	
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
	
	public data() {
		age=20;
		name="msd";
	}
	
	
	
}


public class ConstructorDemo {

	public static void main(String[] args) {
		data d=new data();
		//d.setAge(21);
		//d.setName("rithik");
		System.out.println(d.getName()+":"+d.getAge());
		
		
		
	}

}
