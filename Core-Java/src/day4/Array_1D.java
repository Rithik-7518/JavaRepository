package day4;

public class Array_1D {

	public static void main(String[] args) {

		//array declaring 
		/*
		int a[]=new int[5];
		a[0]=7;
		a[1]=18;
		a[2]=3;
		a[3]=45;
		a[5]=8;
		*/
		
		int a[]= {7,18,3,45,8};
		
		// find length of the array
		System.out.println("the length of the array a is:"+a.length);
		
		// read single value of array
		System.out.println("array value of index 3 is:"+a[3]);
		
		// read multiple array values // done by for loop statement
		for(int i=0;i<a.length;i++) //i<=4 or i<5 or i<a.length or i<=a.length-1
		{
			System.out.println(a[i]);
			
			
		}
		
		
		// enhanced for loop or for each loop
		for(int x:a)
		{
		
			System.out.println(x);
		}
	
	
	
	}

}
