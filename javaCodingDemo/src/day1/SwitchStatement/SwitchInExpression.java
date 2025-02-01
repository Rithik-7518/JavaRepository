package day1.SwitchStatement;

public class SwitchInExpression {

	public static void main(String[] args) {
		String day="SUNDAY";
		String d;
		d=day.toLowerCase();
		String result="";
		
		/*
		result=switch(d) {
		case "saturday", "sunday" -> "Week-End no learning and enjoy it";
		case "monday","tuesday","wednesday","thursday","friday" -> "Week-Day you must learn it";
		default ->"enter the valid day";
		};
		System.out.println(result);
		*/
		
		
		result=switch(d) {
		case "saturday", "sunday" : yield "Week-End no learning and enjoy it";
		case "monday","tuesday","wednesday","thursday","friday" :yield "Week-Day you must learn it";
		default : yield "enter the valid day";
		};
		System.out.println(result);
		
		
	}

}
