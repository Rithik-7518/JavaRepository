package frequently_interview;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String str="ABCD";
		String rev="";
		
		
		
		/* 1)using concentation
		
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reversed string:"+rev);
	`	*/
		
		/*2)using character array
		char a[]=str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
			
		}
		System.out.println("reversed string:"+rev);
		*/
		
		// using stringBuffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
