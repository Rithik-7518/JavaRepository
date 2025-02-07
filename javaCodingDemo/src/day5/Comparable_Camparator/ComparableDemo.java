package day5.Comparable_Camparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
	int age;
	String name;
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	public int compareTo(Students that) {
		if(this.age > that.age)
			return 1;
		else
			return -1;
	}
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		
		Comparator<Students> com= new Comparator<>() {
			
			public int compare(Students o1, Students o2) {
				if(o1.age > o2.age)
					return 1;
				else
					return -1;
			}
			
		};
		
		List<Students> mylist=new ArrayList<>();
		mylist.add(new Students(42,"msd"));
		mylist.add(new Students(36,"vk"));
		mylist.add(new Students(38,"rs"));
		
		
		//Collections.sort(mylist);
		
		for(Students s:mylist)
			System.out.println(s);
	}	

}
