package day5.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		/*List nums=new ArrayList();
		nums.add(5);
		*/
		
		//    or 
		
		List<Integer> nums= Arrays.asList(5,6,3,2,8);
		/*
		Stream<Integer> s1=nums.stream();			//stream cannot be reused
		Stream<Integer> s2=s1.filter(n -> n%2==0);
		Stream<Integer> s3=s2.map(n-> n*2);
		int result= s3.reduce(0, (c,e)->c+e);
		System.out.println(result);
		*/
		
		int result=nums.stream()
						.filter(n -> n%2==0)
						.map(n->n*2)
						.reduce(0, (c,e) -> c+e);
		System.out.println(result);
		
		//s3.forEach(n->System.out.println(n));
		
		
		/*
		int sum=0;
		for(int n:nums) {
			if(n%2==0) {
				n=n*2;
				sum=sum+n;
			}
		}
		
		System.out.println(sum);
		*/
		
	}

}
