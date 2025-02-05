package day4.Enum;

enum StatusCheck{
	Running,Failed,Pending,Success
}

public class EnumIfStatement {

	public static void main(String[] args) {
		
		StatusCheck s= StatusCheck.Success;
		
		if(s==StatusCheck.Success)
			System.out.println("Done");
		else if(s==StatusCheck.Running)
			System.out.println("Processing");
		else if(s==StatusCheck.Pending)
			System.out.println("Please wait");
		else
			System.out.println("try again");
		
	}

}
