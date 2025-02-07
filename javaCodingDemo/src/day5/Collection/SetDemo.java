package day5.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set nums = new HashSet();
		nums.add(7);
		nums.add(3);
		nums.add(45);
		nums.add(18);
		nums.add(7);
		nums.add("hi");
		
		Iterator values=nums.iterator();
		
		while(values.hasNext())
			System.out.println(values.next());
		
		
		
		//for(Object n:nums)
			//System.out.println(n);
		
	}

	
}
