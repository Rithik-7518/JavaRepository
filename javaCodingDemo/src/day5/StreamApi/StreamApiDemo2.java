package day5.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiDemo2 {

	public static void main(String[] args) {
		
		List<Integer> nums= Arrays.asList(5,6,3,2,8);
		
		/*
		 * filter
		 * 
		Predicate<Integer> p=new Predicate<>() {
			public boolean test(Integer n) {
				if(n%2==0)
					return true;
				else
					return false;
			}	
			
		};*/
		
		//Predicate<Integer> p= n -> n%2==0;
		
		/*
		 * map
		 * 
		Function<Integer,Integer> fun = new Function<>() {
			public Integer apply(Integer n) {
				return n*2;
			}
			
		};
		*/
		
		//Function<Integer,Integer> fun =  n -> n*2;
		
		int result=nums.stream()
						.filter( n -> n%2==0)
						.map(n -> n*2)
						.reduce(0, (a,b) -> a+b);
		System.out.println(result);
		
			
	}

}
