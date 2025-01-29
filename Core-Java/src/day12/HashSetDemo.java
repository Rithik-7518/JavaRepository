package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// declaration
		
		HashSet myset= new HashSet();
		//Set myset1= new HashSet();
		//HashSet <String > myset2= new HashSet<String>();
		
		// adding element into hashSet 
		myset.add(100);
		myset.add(7.5);
		myset.add("welcome");
		myset.add("rithik");
		myset.add('R');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		// printing hashSet
		System.out.println(myset);  // remove duplicate and print remaining element
		
		
		// size of hashset
		System.out.println("size of hashset:"+myset.size());
		// remove specific element
		myset.remove(7.5);
		System.out.println("after removing"+myset);
		
		// insertion is not possible
		// access specific element is not possible
		
		// convert  hashSet to arrayList
		ArrayList a1=new ArrayList(myset);
		System.out.println(a1);
		System.out.println(a1.get(3));
		
		// normal for lopp is not possible
		//read all the element using for each loop
		/*for(Object x:myset) {
			System.out.println(x);
		}
		*/
		
		// using iterator
		Iterator it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// clearing all element in hashset
		myset.clear();
		System.out.println(myset.isEmpty());
		
		
		
		
		
		
		

	}

}
