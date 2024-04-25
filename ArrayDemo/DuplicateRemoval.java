package InterviewQ.ArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoval {

	public static void main(String[] args) {

		int [] arr1= {10,20,30,30,40,50,60,500,100,500};

		int [] arr2 = {600,100,200,300,400,500};

		Arrays.sort(arr1);
		System.out.println("Sorted arr1: ");
		for(int i: arr1) {
			System.out.println(i);
		}


		Arrays.sort(arr2);
		System.out.println("Sorted arr2: ");
		for(int x : arr2) {
			System.out.println(x);
		}

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are same ");
		}else {
			System.out.println("Arrys are not same ");
		}

		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {

			for(int j=0; j<arr2.length; j++) {

				if(arr1[i] == arr2[j]) {
					set.add(arr1[i]);
					al.add(arr1[i]);
				}
			}
		}
		System.out.println("Common : "+set);
		System.out.println("Common : "+al);

//		Set hs = new HashSet<>();
//		for(int i: arr1) {
//			hs.add(i);
//		}
//		System.out.println("Elements after removing duplicates: "+ hs);



	}

}
