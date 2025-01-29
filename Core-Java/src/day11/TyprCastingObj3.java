package day11;

public class TyprCastingObj3 {

	public static void main(String[] args) {
		/*
		 * eg 1
		 * 
		Object o= new String("welcome");
		StringBuffer sb=(StringBuffer) o;  // rule 1 & 2-- passed,  rule 3 - failed   
		*/
		
		/*
		 * eg 2
		
		String s =new String ("welcome");
		StringBuffer sb = (StringBuffer) s;  // rule 1-----failed 
		 */
		
		/*
		 * eg 3
		 * 
		
		Object o = new String("welcome");
		StringBuffer sb =(String) o;   // rule 1 -- passed , rule 2--- failed
		 */
		/*
		 * eg 4
		
		String s = new String ("welcome");
		StringBuffer sb =String s;       // rule 1 -- pass , rule 2-- failed
		 */
		/*
		 * eg 5
		
		Object o =new String("welcome");
		StringBuffer sb = (StringBuffer) o;   // rule 1 -- pass , rule 2-- pass , rule 3-- fail
		 */
		
		/*
		 * eg 6
		 * 
		 */
		Object o= new String("Welome");
		String s= (String ) o;		// rule 1-- pass, 2-- pass 3-- pass
		System.out.println(s);
		
		
		
		
		
		
		
		

	}

}
