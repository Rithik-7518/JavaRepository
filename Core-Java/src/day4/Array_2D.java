package day4;

public class Array_2D {

	public static void main(String[] args) {

		// int a[][]=new int[3][2] 3rows and 2columns
		// int a[0][0]=123
		
		int a[][]= { {7,45},
					 {3,8},
					 {18,7}  };
		
		// find the length of the array
		System.out.println("length of rows :" +a.length);
		System.out.println("lenth of columns:"+a[0].length);
		
		// read single value of array
		//System.out.println(a[1][0]);
		
		// read multiple value using for loop
		for(int r=0;r<a.length; r++)
		{
			
			for(int c=0;c<a[r].length;c++) 
			{
				System.out.print(a[r][c]+"   ");
			}
			System.out.println();
		}
		
		//enhanced for loop
		
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		
	}

}
