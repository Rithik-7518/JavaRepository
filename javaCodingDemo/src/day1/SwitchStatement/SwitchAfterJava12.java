package day1.SwitchStatement;

public class SwitchAfterJava12 {

	public static void main(String[] args) {
		
		String day="SUNDAY";
		String d;
		d=day.toLowerCase();
		
		switch(d) {
		case "saturday", "sunday" -> System.out.println("Week-End no learning and enjoy it");
		case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("Week-Day you must learn it");
		default ->System.out.println("enter the valid day");
		}
		
	}

	

}
