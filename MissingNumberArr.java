package InterviewQ;

public class MissingNumberArr {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7};

		//How to find the missing number
		//add all number
		//1+2+4+5 = 12  // missing num is 3
		//1+2+3+4+5 = 15  
		//15-12 -> 3 is missing number
				
		int sum =0;
		for(int i=0; i<a.length; i++) {			
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		int total =0;
		for(int j=1 ; j<=8; j++) {
			total = total + j;
		}
		System.out.println(total);
		
		System.out.println("Missing number is: "+ (total - sum));
		
		
		
		
	}

}
