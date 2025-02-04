package day3.ThisKeyword;

class data{
	
	//private int age =21;
	//private String name="Rithik";
	
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
	
	
	
}


public class ThisKeyword {

	public static void main(String[] args) {
		data d=new data();
		d.setAge(21);
		d.setName("rithik");
		System.out.println(d.getAge()+":"+d.getName());
		
		
		
	}

}
