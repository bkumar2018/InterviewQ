package InterviewQ;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(" Factorial of 1: "+ factorialWithRecursive(-11));
		System.out.println(" Factorial of 2: "+ factorialWithRecursive(2));
		System.out.println(" Factorial of 3: "+ factorialWithRecursive(3));
		System.out.println(" Factorial of 4: "+ factorialWithRecursive(4));
		
		System.out.println(" Factorial of 5: "+ fact(5));
		System.out.println(" Factorial of 10: "+ fact(10));
	}

	//fact 3! = 3.2.1
	//fact 4! = 4.3.2.1
	//fact 5! = 5.4.3.2.1
	//fact 1 =1
	//fact 0 =1
	
	private static int factorialWithRecursive(int num) {

		if(num <0) {
			return 0;
		}
		
		if(num==1 && num==0) {
			return 1;
		}

		int fact=1;
		for(int i=2; i<= num; i++) {
			fact=fact*i;			
		}
		
		return fact;	

	}
	
	
	//Using recursive method
	public static int  fact(int num) {
		
		if(num ==0)
			return 1;
		
		else
			return (num*fact(num-1));
	}
	
	
}
