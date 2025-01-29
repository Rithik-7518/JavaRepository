package day3;

public class forLoop {

	public static void main(String[] args) {

		System.out.println("output for first for loop ");
		for(int i=0;i<=10;i++) {
			
			System.out.println(i);
		}
		
		System.out.println("output for second for loop ");
		for(int j=10;j>0;j--) {
			
			System.out.println(j);
		}
		
		System.out.println("output for third for loop ");
		for(int z=2;z<=10;z+=2) {
			
			System.out.println(z);
		}
		
		System.out.println("output for fourth for loop ");
		for (int a=1;a<=10;a++) {
			
			if(a%2==0) {
				System.out.println(a + " even");
			}
			else {
				System.out.println(a+" odd");
			}
			
		}
	}

}
