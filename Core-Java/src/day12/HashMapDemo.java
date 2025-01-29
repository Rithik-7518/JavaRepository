package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		// declaration
		//HashMap hm1= new HashMap();
		//Map hm2= new HashMap();
		HashMap <Integer,String> hm= new HashMap <Integer,String>();
		
		// adding pairs
		hm.put(101, "Rithik");
		hm.put(102, "msd");
		hm.put(103, "vk");
		hm.put(104, "Rithik");
		hm.put(105, "msd");
		
		System.out.println(hm);
		
		// size of hashmap
		System.out.println("size of hashmap:"+hm.size());
		
		// remove pair
		hm.remove(104);
		System.out.println("after removing :" +hm);
		
		//access value of the key
		System.out.println(hm.get(102));
		
		// get all key from hashmap
		System.out.println(hm.keySet());
		
		// all the value from hashmap
		System.out.println(hm.values());
		
		// key with value
		System.out.println(hm.entrySet());
		
		// replace value
		hm.put(105, "rs");
		System.out.println(hm);
		
		// reading data from hashmap
		/* for each loop
		for(int k:hm.keySet()) {
			System.out.println(k+"   " +hm.get(k));
		}
		*/
		
		
		// using iterator
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry entry=it.next();	
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		// clear 
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
	}

}
