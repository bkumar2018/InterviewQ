package InterviewQ;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int[] num = {-10,20,50,-88,987};  //Integer array
		
		int l = num[0];  // Both largest and smallest number point to 1st value that is 0th index value. 
		int s = num[0];
		
		for(int i=1 ; i<num.length; i++) {   // loop start from 1st index as 0th index is in l and s.
			if(num[i]> l) {
				l = num[i];
			}else if(num[i]<s){
				s = num[i];
			}
		}
		
		System.out.println("Integer array: "+ Arrays.toString(num));
		
		System.out.println("Largest: "+ l);
		System.out.println("Smalles: "+ s);
		
		
		
	}

}
