package day4;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int a[]= {7,8,3,7,18,7,45,7};
		int num=7;
		int count=0;
		
		for(int value:a) 
		{
			if(value==num) 
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
