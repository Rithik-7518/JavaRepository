package day6;

public class StudentVarMain {

	public static void main(String[] args) {

		
		//StudentVar stu=new StudentVar();
		
		// 1) using object reference variables
		/*stu.sid=7;
		stu.sname="Rithik";
		stu.grade='A';
		stu.printStudentData();
		*/
		
		
		// 2) using method----> it is not used store data permanent it chance values
		/*stu.setStudentData(18, "virat", 'B'); 		
		stu.printStudentData();
		*/
		
		
		// 3) using constructor
		StudentVar stu=new StudentVar(45, "rohit", 'B');
		stu.printStudentData();
		
		
		
	}

}
