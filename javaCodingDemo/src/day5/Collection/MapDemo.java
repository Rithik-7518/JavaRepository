package day5.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map student=new Hashtable();
		student.put("msd", 7);
		student.put("vk", 18);
		student.put("sr", 1234);
		student.put("rs", 45);
		student.put("sr", 3);
		
		//System.out.println(student.keySet());
		
		for(Object key:student.keySet()) {
			System.out.println(key+":"+student.get(key));
		}
		
	}

}
