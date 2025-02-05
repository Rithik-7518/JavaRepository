package day4.Enum;

enum Status{
	Running,Failed,Pending,Success
}

public class EnumDemo {

	public static void main(String[] args) {
		
		//Status s= Status.Success;
		
		// print status index num
		//System.out.println(s.ordinal());
		
		Status[] ss= Status.values();
		for(Status s :ss ) {
			System.out.println(s+":"+s.ordinal());
		}
		
	}

}
