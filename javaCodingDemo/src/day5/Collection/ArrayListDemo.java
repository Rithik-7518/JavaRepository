package day5.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

	
	
	public static void main(String[] args) {
		
		ArrayList nums = new ArrayList();
		nums.add(7);
		nums.add(3);
		nums.add(45);
		nums.add(18);
		nums.add("hi");
		
		
		
		System.out.println(nums.indexOf(3));
		System.out.println(nums.get(4));
		
		for(Object n:nums)
			System.out.println(n);
		
	}

	
}
