package InterviewQ;

public class RemoveJunkCharString {

	public static void main(String[] args) {

		String s = "12313感谢您观看$#@!%^&*()123456abcdsdf";
		
		//How will you remove junk char ?
		//By Using Regular Expression  [^a-zA-Z0-9]
		String regex="[^a-zA-Z0-9]";
		s= s.replaceAll(regex, "");
		System.out.println(s);
		
		String s1 = "12313感谢您观看$#@!%^&*()123456abcdsdf @#$@#$selenium!@#@!3 $#%$#%java@#$@#4";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
