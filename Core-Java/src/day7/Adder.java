package day7;

public class Adder {

	
	//overloading
	
	int a=10,b=20;
	
	void sum() // 1---> method names should be same
	{
		System.out.println(a+b);
	}
	
	void sum(int x,int y ) //2---> number of parameter should be different
	{
		System.out.println(x+y);
	}
	
	void sum(int x,double y ) //3--->data type of parameter should be different
	{
		System.out.println(x+y);
	}
	
	void sum(double x,int y ) //4--->order of parameter should be different
	{
		System.out.println(x+y);
	}
	
	void sum(int a,int b,int c) //5--->
	{
		System.out.println(a+b+c);
	}
	
}
