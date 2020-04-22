package InterviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I love India";
		System.out.println(str);
		
		//By using StringFormatter
		//System.out.println(StringFormatter.reverseString("my name is khan"));  
		
		//By using StringBuilder class 
		System.out.println(reverseStringSB(str));
		
		reverseStringBytoCharArray(str);
		
		reverseStringBytoCharArrayStartNEnd(str);
		
		pub();
		
		// using StringBuffer 
		// String is immutable[ unable to be changed.] StringBuffer is mutable, StringBuffer class have reverse method
		
		StringBuffer sb = new StringBuffer("Selenium");
		System.out.println(sb.reverse());
	}
	
	//using for loop
	private static void pub() {
		// TODO Auto-generated method stub
		
		String str = "Selenium";
		
		int len = str.length();
		String rev= "";
		
		for(int i=len-1; i>=0; i-- ) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
	}
	
	
	//using StringBuilder Class its mutable and has "reverse" method.
	public static String reverseStringSB(String str){  
		
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    
	    return sb.toString();  
	}
	
	private static void reverseStringBytoCharArray(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i= ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}		

	}
	
	private static void reverseStringBytoCharArrayStartNEnd(String str) {
		
		char[] ch = str.toCharArray();

		int start, end = 0;
		end = ch.length-1;
		
		System.out.println();		
		for(start=0; start < end ; start++, end--) {
			
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;			
		}
		
		for(char c: ch) {
			System.out.print(c);
		}
		
	}
	

}
