package day5.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamSort {

	public static void main(String[] args) {
		
		List<Integer> nums= Arrays.asList(5,6,3,2,8);
		
		/*
		int result=nums.stream()
						.filter( n -> n%2==0)
						.map(n -> n*2)
						.reduce(0, (a,b) -> a+b);
		System.out.println(result);
		*/
		
		Stream<Integer> values=nums.stream()
				.filter( n -> n%2==0)
				.map(n -> n*2)
				.sorted();
		
		values.forEach(i -> System.out.println(i));
	}

}
