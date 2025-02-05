package day4.Annotation;


class A{
	
	public int  showTheDataWhichBelongsToThisClass(int a,int b) {
		int c=a+b;
		return c;
	}
}

class B extends A{
	@Override
	public int showTheDataWhichBelongsToThisClass(int a,int b) {
		int c=a*b;
		return c;
	}
}

public class AnnotationDemo {

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.showTheDataWhichBelongsToThisClass(7, 3));
		
	}

}
