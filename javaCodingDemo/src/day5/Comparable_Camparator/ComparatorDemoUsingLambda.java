package day5.Comparable_Camparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentsDeatils {
	int age;
	String name;
	public StudentsDeatils(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
}

public class ComparatorDemoUsingLambda {

	public static void main(String[] args) {
		
		Comparator<StudentsDeatils> com = ( o1,  o2) -> {
				/*if(o1.age > o2.age)
					return 1;
				else
					return -1;
			*/
			
			return o1.age > o2.age?1:-1;
			
		};
		
		List<StudentsDeatils> mylist=new ArrayList<>();
		mylist.add(new StudentsDeatils(42,"msd"));
		mylist.add(new StudentsDeatils(36,"vk"));
		mylist.add(new StudentsDeatils(38,"rs"));
		
		
		Collections.sort(mylist,com);
		
		for(StudentsDeatils s:mylist)
			System.out.println(s);
	}	

}
