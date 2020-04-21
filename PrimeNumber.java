package InterviewQ;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("0 is prime number: "+isPrimeNo(0));
		System.out.println("1 is prime number: "+isPrimeNo(1));
		System.out.println("2 is prime number: "+isPrimeNo(2));
		System.out.println("3 is prime number: "+isPrimeNo(3));
		System.out.println("4 is prime number: "+isPrimeNo(4));
		
		System.out.println("10 is prime number: "+isPrimeNo(10));
		System.out.println("13 is prime number: "+isPrimeNo(13));
		
		System.out.println("-3 is prime number: "+isPrimeNo(-3));
		
		System.out.println();
		getPrimeNumbers(20);
		
		System.out.println();
		getPrimeNumbers(30);
		
	}
	
	public static boolean isPrimeNo(int data) {
		
		//1. Can be divided by itself or zero
		//   13/13 is prime number
		//   4/2 4/4  4 is not prime number
		// 10  10/2 10/5 10/10   10 is not prime number
		// 1 is not prime number
		// 2 is lowest prime number
		// 3 is prime number
		
		
		if(data <=1) {
			return false;
		}
		
		for (int i=2 ; i<data ; i++) {				
			//data is divisible by 2 and remainder is zero, then return false.
			if(data % i == 0) {
				return false;
			}				
		}		
		return true;
	}
	
	
	public static void getPrimeNumbers(int num) {
		
		System.out.println("All prime number till number: "+num);
		for(int i=2; i<=num ; i++) {
			if(isPrimeNo(i)) {
				System.out.print(i+ " ");
			}
		}
			
		
	}
	

}
