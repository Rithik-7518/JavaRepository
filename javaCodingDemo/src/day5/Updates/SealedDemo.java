package day5.Updates;

sealed class A permits B,C{
	
}

non-sealed class B extends A {
	
}

final class C extends A{
	
}

final class D extends B{
	
}

sealed interface X permits Y{
	
}

non-sealed interface Y extends X{
	
}




public class SealedDemo {

	public static void main(String[] args) {
		
	}

}
