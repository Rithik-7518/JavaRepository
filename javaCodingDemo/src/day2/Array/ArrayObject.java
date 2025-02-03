package day2.Array;
class Student{
	int rollno;
	String name;
	int marks;
}
public class ArrayObject {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=7;
		s1.name="msd";
		s1.marks=99;
		
		Student s2=new Student();
		s2.rollno=18;
		s2.name="vk";
		s2.marks=95;
		
		Student s3=new Student();
		s3.rollno=45;
		s3.name="rs";
		s3.marks=90;
		
		Student stud[]=new Student[3];
		stud[0]=s1;
		stud[1]=s2;
		stud[2]=s3;
		
		
		/*
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i].name + ":" + stud[i].marks);
		}
		*/
		
		for(Student s : stud) {
			System.out.println(s .name + ":" + s.marks);
		}
		
		
	}

}
