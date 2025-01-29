package day6;

public class Employee {

	//class ---> collections of variables and methods
	
	// variable
	int eid;
	String ename;
	String job;
	int sal;
	
	// methods
	void display()
	{
		System.out.println("Employee id is: "+eid);
		System.out.println("Employee name is: "+ename);
		System.out.println("Employee job role is: "+job);
		System.out.println("Employee salary is: "+sal);
	}
	
	
	
	
	public static void main(String[] args) {

		Employee emp1=new Employee();
		emp1.eid=07;
		emp1.ename="rithik";
		emp1.job="MD";
		emp1.sal=100000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=10;
		emp2.ename="gokul";
		emp2.job="manager";
		emp2.sal=50000;
		emp2.display();
		
		
		
		
		
	}

}
