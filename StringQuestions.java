package InterviewQ;

import java.util.Arrays;

public class StringQuestions {

	public static void main(String[] args) {
		
		String str = "I love India! Birender";
		System.out.println("This given string is: "+ str);
		
		System.out.println("Length of string is: "+str.length());
		System.out.println("Char at specific index 0: "+ str.charAt(0));
		System.out.println("index of character B: "+ str.indexOf('B'));
		System.out.println(str.indexOf('i', str.indexOf('s')+1));
		
		System.out.println("Get index of love: "+str.indexOf("love"));
		
		System.out.println(str.indexOf("helllo"));  // return -1 if not found
		
		String str1= "I Love India! Birender";  // Letter of love is now Love
		
		//String comparison
		System.out.println(str.equals(str1));  // If equals then return True 
		System.out.println(str.equalsIgnoreCase(str1));  // ignore case
		
		//substring
		System.out.println(str.substring(0, 8));
		
		//trim
		String s = "  Hello Birender!!  ";		
		System.out.println(s.trim());  //Before and after spaces are trim out, but intermideate space will be there
		
		System.out.println(s.replace(" ", ""));  // very useful 
		
		String date = "01-01-2020";		
		//replace - to #
		System.out.println(date.replace("-", "#"));
		
		//split
		String[] splt =str1.split(" ");
		System.out.println(Arrays.toString(splt));
		//OR
		for(String str2: splt) {
			System.out.println(str2);
		}
		
		String c = "care";
		System.out.println(c.concat("s"));
		
		String x = "Hello";
		String y = "world";
		 int a = 100;
		 int b = 200;
		 
		 System.out.println(x+y); //Helloworld
		 System.out.println(a+b);  //300
		 System.out.println(x+y+a+b); //300Helloworld
		 System.out.println(x+y+(a+b));
		 System.out.println(a+b+x+y);  //300Helloworld
		 
		 
		
	}

}
