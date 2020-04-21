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
		
		
	}
	
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
