package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// declaration 
		
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <String> mylist=new ArrayList<String>();		
		
		
		// adding data into array list
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('R');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		
		// size of array list
		System.out.println("number of arraylist:"+mylist.size());
		System.out.println("printing data from array list"+mylist);
		
		//remove element from array list
		mylist.remove(5);
		System.out.println("printing new data from array list"+mylist);
		
		// insert element in array list
		mylist.add(4, "ithik");
		System.out.println("after insert"+mylist);
		
		// modify element
		mylist.set(4, "rithik");
		System.out.println("after replace data "+mylist);
		
		//access specific element
		System.out.println("access specific data : "+mylist.get(2));
		
		// reading all element from arrayList
		/* 1) normal for loop
		for(int i=0;i<mylist.size();i++) {			System.out.println(mylist.get(i));

		}
		*/
		
		/*using for each loop
		for(Object x:mylist) {
			System.out.println(x);

		}
		*/
		
		
		// using iterator
		Iterator it=mylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
			
		// checking arrayList is Empty or not
		System.out.println(mylist.isEmpty());
		
		// romove all the element for arrayList
		//mylist.removeAll(mylist);  or mylist.clear();
		
		System.out.println(mylist);
		
		
		ArrayList mylist2= new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		mylist2.add('R');
		System.out.println(mylist2);
		mylist.removeAll(mylist2);
		System.out.println("after removing"+mylist);
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
