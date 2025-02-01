package day1.LoopCondition;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			System.out.println(i+".hello");
			int j=1;
			while(j<=2) {
				System.out.println(j+".hi");
				j++;
			}
			
			i++;
		}
		
		
	}

}
