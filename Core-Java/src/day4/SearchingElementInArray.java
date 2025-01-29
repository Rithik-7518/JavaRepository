package day4;

public class SearchingElementInArray {

	public static void main(String[] args) {

		
		int a[]= {8,3,18,45,7};
		int search_element= 7;
		boolean status =false;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==search_element) 
			{
				System.out.println("Element is found");
				status=true;
				break;
			}
		
		}
		
		
		//using enhanced for loop
		for(int x:a) {
			if(x==search_element) 
			{
				System.out.println("Element is found");
				status=true;
				break;
			}
		}
		
		
		
		if(status==false) 
		{
			System.out.println("element is not found");
		}
		
	}

}
