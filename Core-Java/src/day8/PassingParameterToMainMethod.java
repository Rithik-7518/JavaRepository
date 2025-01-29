package day8;

public class PassingParameterToMainMethod {

	public static void main(String args[]) {

		System.out.println(args.length);
		
		for(String value:args) {
			System.out.println(value);
		}
		
		// passing parameter in run configuration --> argument --> program argument edit it 
	}

}
