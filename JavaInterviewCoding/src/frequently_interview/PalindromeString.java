package frequently_interview;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str=sc.next();
		
		String orgstr=str;
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		//System.out.println(rev);
		if(orgstr.equals(rev)) {
			System.out.println(orgstr+" palindrome string");
		}
		else {
			System.out.println(orgstr+" palindrome string");
		}

	}

}
