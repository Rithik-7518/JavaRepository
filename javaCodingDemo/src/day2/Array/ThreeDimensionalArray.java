package day2.Array;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		
		
		// array creation
		int nums[][][]= new int [2][2][2];
		
		// store data in array randomly with the help of Math
		for (int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int z=0;z<2;z++)
				nums[i][j][z]=(int)( Math.random()*10);
			}
			
		}
		
		
		// printing values
		for (int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int z=0;z<2;z++)
				
				System.out.print(nums[i][j][z] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
