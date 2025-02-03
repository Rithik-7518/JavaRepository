package day2.method;

public class MethodDemo {

	
	public void PlayMusic() {
		System.out.println("music playing");
	}
	
	public String getPen(int cost) {
		if(cost>=7) 
			return "pen";
		else
			return "nothing";
	}
	
	
	public static void main(String[] args) {
		
		MethodDemo md=new MethodDemo();
		md.PlayMusic();
		String str=md.getPen(8);
		System.out.println(str);
		
	}

}
