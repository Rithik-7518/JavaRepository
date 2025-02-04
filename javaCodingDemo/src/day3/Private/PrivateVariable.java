package day3.Private;

class data{
	
	//private int age =21;
	//private String name="Rithik";
	
	private int age;
	private String name;
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
}


public class PrivateVariable {

	public static void main(String[] args) {
		data d=new data();
		d.setAge(21);
		d.setName("rithik");
		System.out.println(d.getAge());
		System.out.println(d.getName());
		
		
	}

}
