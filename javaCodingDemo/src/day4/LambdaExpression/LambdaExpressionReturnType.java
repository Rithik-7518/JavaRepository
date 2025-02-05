 package day4.LambdaExpression;


@FunctionalInterface
interface A{
	int add(int i,int j);
}




public class LambdaExpressionReturnType {

	public static void main(String[] args) {
		A obj = (i,j)-> i+j;
		int r=obj.add(7, 18);
		System.out.println(r);
		
	}

}
