package frequently_interview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		
		/*1) using algm
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;   // 0*10+1234%10==4    4*10+123%10=43
			num=num/10;				// 1234/10==123 	123/10=12
			
		}
		System.out.println("reverse number:"+rev);
		*/
		
		/*2) stringbuffer class
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("reverse number:"+rev);
		*/
		
		
		//3) StringBulider class
		StringBuilder sb1= new StringBuilder();
		sb1.append(num);
		
		StringBuilder rev=sb1.reverse();
		
		
		System.out.println("reverse number:"+rev);
		
		
	}

}
