package accessModifier;

public class Test1 {

	/*
	 * private access modifier --> access only within the class
	 
	private int x=7;
	private void m1() {
		System.out.println("this is m1 method ");
	}
	*/
	
	/*
	 * default access modifier ---> access within the package
	 
	int x=7;
	void m1() {
		System.out.println("this is m1 method ");
	}
	*/
	
	/*
	 *  protected access modifier ---> access outside package using inhertaince 
	 
	
	protected int x=7;
	protected void m1() {
		System.out.println("this is m1 method ");
	}
	*/
	
	
	public int x=7;
	public void m1() {
		System.out.println("this is m1 method ");
	}
	
}
