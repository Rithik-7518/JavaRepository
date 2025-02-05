package day4.LambdaExpression;


@FunctionalInterface
interface Z{
	void Show(int i);
	
}




public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Z obj = (i)-> 
				System.out.println("in show from main method:"+i);
		obj.Show(6);
		
	}

}
