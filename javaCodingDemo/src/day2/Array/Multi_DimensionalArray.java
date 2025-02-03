package day2.Array;

public class Multi_DimensionalArray {

	public static void main(String[] args) {
		
		
		// array creation
		int nums[][]= new int [3][4];
		
		// store data in array randomly with the help of Math
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j]=(int)( Math.random()*10);
			}
			
		}
		
		
		// printing values
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		// printing using enhanced for loop
		System.out.println("using enhanced for loop");
		for (int n[]:nums) {
			
			for(int m:n) {
				
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
		
	}

}
