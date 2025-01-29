package day3;

public class whileLoop_demo {

	public static void main(String[] args) {
		
		/*
		 * while loop 
		 * 1)initalization
		 * 2)condition
		 * 3)increament or decreament
		 * 		
		 */
		
		// printing 1 to 10 number in while
		System.out.println("output for first  while loop");
		int i=1; // initalization
		
		while(i<=10)  // condition
		{
			System.out.println(i);
			i++;
			
		}
		
		
		
		//printing hello in ten times
		System.out.println("output for second  while loop");
		int j=1;
		while(j<=10)
		{
			System.out.println("hello");
			j++;
			
		}
		
		
		
		// printing even between 1 to 10
		System.out.println("output for third  while loop");
		int z=2;
		while(z<=10) {
			System.out.println(z);
			z+=2;
		}
		
		
		
		
		System.out.println("output for fourth  while loop");
		int b=1;
		while(b<=10) {
			if(b%2==0) {
				System.out.println(b +" " + "even");
			}
			else {
				System.out.println(b +" odd");
			}
			b++;
		}
		
		
	}

}

/*
int i=1;
while(i<=10) 
{
	if(i%2==0) 
	{
		System.out.println(i);
		i++;
		
	}
}
*/
