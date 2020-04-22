package InterviewQ;

public class SwapIntergerWitoutThirdvar {

	public static void main(String[] args) {
		
		 
		int x = 5;  //(In Binary) 0101
		int y = 10; //(In Binary)  1010
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("************************");
		// By using temporary var
//		int t;
//		t=x; //5
//		x=y;//10
//		y=t; //5
			
		
		//1. without using 3rd var: using + operator
//		x = x+y; //15
//		y = x-y; //5
//		x = x-y;  //10
				
		//2. using * operator
//		x = x*y; // 50
//		y = x/y; //5
//		x = x/y; //10
		
		
		//3. Using XOR ^
		x = x^y; // 15 -- 1111
		y = x^y; //10 -- 1010
		x = x^y; //5 -- 0101
		
		System.out.println(x);
		System.out.println(y);
		
//		Bitwise OR Operation of 5 and 10
//		  0101
//		| 1010
//		 ________
//		  1111  = 15 (In decimal) 
		
//
//		DECIMAL NUMBERS IN BINARY
//		0	0
//		1	1
//		2	10
//		3	11
//		4	100
//		5	101
//		6	110
//		7	111
//		8	1000
//		9	1001
//		10	1010
//		11	1011
//		12	1100
//		13	1101
//		14	1110
//		15	1111
		
		pub();
		
	}

	
	private static void pub() {
		// TODO Auto-generated method stub

		String a = "Hello";
		String b = "World";

		System.out.println(a);
		System.out.println(b);

		System.out.println("***************");
		
		//1. append a and b 
		a = a+b; // Helloworld
		
		//2. 
		b = a.substring(0, a.length()-b.length());
		
		//3. 
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}
}
