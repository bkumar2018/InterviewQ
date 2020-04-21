package InterviewQ;

public class ReverseWordsInString {

	public static void main(String args[]) {
		
		String str = "I Love India!";
		System.out.println(str);
		
		reverWordsInStr(str);
		
	}
	
	public static void reverWordsInStr(String str) {
		
		String[] rstr = str.split(" ");
		
		for(int i = rstr.length-1; i>=0 ; i--) {
			System.out.print(rstr[i]+ " ");
		}
	}
}
