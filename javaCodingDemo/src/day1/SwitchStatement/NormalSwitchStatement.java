package day1.SwitchStatement;

public class NormalSwitchStatement {

	public static void main(String[] args) {
		int day =0;
		
		switch(day) {
		case 0:
			System.out.println("invalid data");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("invalid data");
		}
	}

}
