package day10;

public class FinallyBlock {

	public static void main(String[] args) {

System.out.println("program is started");
		
		String s="hello";
		try {
			
		
		System.out.println(s.length());
		}
		
		catch(NumberFormatException e) {
			System.out.println("catch block handled exception");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("you entered into finally block");
		}
		System.out.println("program is finished");
		
		
	}

}
