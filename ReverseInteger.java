package InterviewQ;

public class ReverseInteger {

	public static void main(String[] args) {
	
		//How will you Reverse an Integer.
		//1. if number is divided by 10 it will give you the same number without last digit. e.g
		// e.g 12569 then after divided by 10, will give you 1256
		
		//int n = 58914257;
		long n = 12456;
		
		System.out.println(n);
		long rev = 0;
		
		while(n!=0) {
			rev = rev*10  + n%10;
			n = n/10;
		}
		System.out.println(rev);
		
		// By using StringBuffer, its mutable and has reverse method.
		n = 12456;
		System.out.println(new StringBuffer(String.valueOf(n)).reverse());
				
		
		
	}

}
