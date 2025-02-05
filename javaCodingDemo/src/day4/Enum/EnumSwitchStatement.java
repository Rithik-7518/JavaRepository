package day4.Enum;

enum StatusCheck1{
	Running,Failed,Pending,Success
}

public class EnumSwitchStatement {

	public static void main(String[] args) {
		
		StatusCheck1 s= StatusCheck1.Running;
		
		switch (s) {
		case Running:System.out.println("processing");break;
		case Failed: System.out.println("try again");break;
		case Pending: System.out.println("pending");break;
		default : System.out.println("done");
		
		}
	}

}
