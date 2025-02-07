package day1.LoopCondition;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		List<Integer> nums= Arrays.asList(5,6,3,2,8);
		
		/*
		Consumer<Integer> con= new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};*/
		
		//Consumer<Integer> con= n -> System.out.println(n);
		
		nums.forEach( n -> System.out.println(n));
		
		
	}

}
