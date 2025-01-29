package day6;

public class StudentVar {

	int sid;
	String sname;
	char grade;
	
	
	void printStudentData() {
		System.out.println("student id is: "+sid+"  "+"Student name is: " +sname +"  " +"Student grade is: "+grade);

	}
	
	void setStudentData(int id,String name,char gr) {
		sid=id;
		sname=name;
		grade=gr;
		
	}
	
	StudentVar(int id,String name,char gr) {
		sid=id;
		sname=name;
		grade=gr;
		
		
	}
	
}
