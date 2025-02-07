package day5.Comparable_Camparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Comparator<Student> com= new Comparator<>() {
			
			public int compare(Student o1, Student o2) {
				if(o1.age > o2.age)
					return 1;
				else
					return -1;
			}
			
		};
		
		List<Student> mylist=new ArrayList<>();
		mylist.add(new Student(42,"msd"));
		mylist.add(new Student(36,"vk"));
		mylist.add(new Student(38,"rs"));
		
		
		Collections.sort(mylist,com);
		
		for(Student s:mylist)
			System.out.println(s);
	}	

}
