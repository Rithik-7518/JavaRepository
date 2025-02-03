package day2.Array;

public class JaggedArray {

	public static void main(String[] args) {

		// array creation
		int nums[][]= new int [3][];
		
		// changing columns size in array is known to be jaggedArray
		nums[0]=new int [3];
		nums[1]=new int [2];
		nums[2]=new int[3];
		
		// store data in array randomly with the help of Math
		for (int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]=(int)( Math.random()*10);
			}
			
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
