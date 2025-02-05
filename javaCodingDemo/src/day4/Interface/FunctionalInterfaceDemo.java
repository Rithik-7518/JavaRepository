package day4.Interface;

@FunctionalInterface
interface Z{
	void Show();
	
}




public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Z obj = new Z() {

			public void Show() {
				System.out.println("in show from main method");
			}
			
		};
		obj.Show();
		
	}

}
