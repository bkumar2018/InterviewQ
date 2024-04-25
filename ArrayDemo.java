package ArraysDemo;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] data = new Object[5];
		data[0] = "Hello";
		data[1] = 100;
		data[2] = 19.50;
		data[3] = false;
		data[4] = true;
		
		//Object[] objArr = new Object[5];
			
		System.out.println(data); // [Ljava.lang.Object;@182decdb
		
		//print all data from the object data
		for(Object o: data) {
			System.out.println(o);
		}
		
		intArrayDemo();
		System.out.println();
		
		int a[] = {10,4,11,7,6,20};
		int k = 2;
		int n = a.length;
		System.out.println("Array to sort except one: ");
		for(Object o: a) {
			System.out.print(" "+ o);
		}
		System.out.println();
		sortExceptOne(a, k, n);
//		for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
		for(Object o: a) {
			System.out.print(" "+ o);
		}
		
	}
	
	//Java Program for Sorting all array elements except one
	private static void sortExceptOne(int[] a, int k, int n) {
		
//		Below is an efficient solution.  
//		Swap k-th element with the last element.
//		Sort all elements except the last.
//		For every element from (k+1)-th to last, move them one position ahead.1
//		Copy k-th element back to position k. 

		// Move k-th element to end
		int temp = a[k];
		a[k] = a[n-1];
		a[n-1] = temp;
		System.out.println();
		for(Object o: a) {
			System.out.print(" "+ o);
		}
		System.out.println();
		
		// Sort all elements except last
        Arrays.sort(a, 0, n-1);
      
        // Store last element (originally k-th)
        int last = a[n-1];
        
        // Move all elements from k-th to one
        // position ahead.
        for (int i = n-1; i > k; i--)
        a[i] = a[i-1];
        
        for(Object o: a) {
			System.out.print(" "+ o);
		}
    	System.out.println();
        
        // Restore k-th element
        a[k] = last;
        
       	System.out.println();
	}

	public static void intArrayDemo() {
		System.out.println("int aray demo...");
		
		//array with data initialize in the beginning
		int[] arryInt = {10,60,50,90,80,20,30};
		System.out.println(arryInt);
		System.out.println(Arrays.asList(arryInt));
		
		//array initialize with some size and later provided data.
		int[] arrIntb = new int[5];
		arrIntb[0] = 10;
		arrIntb[1] = 12;
		arrIntb[2] = 15;
		
		for(int i: arryInt) {
			System.out.print(i +" ");
		}
		
		for(int j: arrIntb) {
			System.out.print(j +" ");
		}
	}
}
////////////////
Arrays take out common elements:
///////////////////
package ArraysDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysTakeOutCommonElements {

	public static void main(String[] args) {

		// 1. Common elements int arrays
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 100, 200, 10, 30 };
		int[] arr3 = {};

		List ll = new ArrayList();

//		System.out.println("Arrays.compare() output: " + Arrays.compare(arr1, arr1)); // return 0 if both arrays are same.
//		System.out.println("Arrays.compare() output: " + Arrays.compare(arr1, arr2)); // return -1 if both arrays differ.

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				// compare arr1 1st element with all other elements from arr2 one by one
				if (arr1[i] == arr2[j]) {
					ll.add(arr1[i]);
				}
			}
		}
		

		System.out.println(ll);

		// 2. Common elements string arrays
		String[] strArray1 = { "Java", "Scala", "Python" };
		String[] strArray2 = { ".Net", "Scala", "Clojure", "Java", "Java Script", "Python" };

		for (int i = 0; i < strArray1.length; i++) { // outer loop
			for (int j = 0; j < strArray2.length; j++) {// inner loop
				if (strArray1[i].equals(strArray2[j])) {
					System.out.println(strArray1[i]);
					break;
				}
			}
		}
		
		FindCommonElemet(strArray1, strArray2);

	}

	private static void FindCommonElemet(String[] arr1, String[] arr2) {
		
		//In HashSet - no duplicates allowed
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					
					// add common elements
					set.add(arr1[i]);
					break;
				}
			}
		}
		for (String i : set) {
			System.out.print(i + " ");
		}
	}

}
////////////////////////
ArraysTakeOutCommonElements
////////////////////////
  package ArraysDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysTakeOutCommonElements {

	public static void main(String[] args) {

		// 1. Common elements int arrays
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 100, 200, 10, 30 };
		int[] arr3 = {};

		List ll = new ArrayList();

//		System.out.println("Arrays.compare() output: " + Arrays.compare(arr1, arr1)); // return 0 if both arrays are same.
//		System.out.println("Arrays.compare() output: " + Arrays.compare(arr1, arr2)); // return -1 if both arrays differ.

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				// compare arr1 1st element with all other elements from arr2 one by one
				if (arr1[i] == arr2[j]) {
					ll.add(arr1[i]);
				}
			}
		}
		

		System.out.println(ll);

		// 2. Common elements string arrays
		String[] strArray1 = { "Java", "Scala", "Python" };
		String[] strArray2 = { ".Net", "Scala", "Clojure", "Java", "Java Script", "Python" };

		for (int i = 0; i < strArray1.length; i++) { // outer loop
			for (int j = 0; j < strArray2.length; j++) {// inner loop
				if (strArray1[i].equals(strArray2[j])) {
					System.out.println(strArray1[i]);
					break;
				}
			}
		}
		
		FindCommonElemet(strArray1, strArray2);

	}

	private static void FindCommonElemet(String[] arr1, String[] arr2) {
		
		//In HashSet - no duplicates allowed
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					
					// add common elements
					set.add(arr1[i]);
					break;
				}
			}
		}
		for (String i : set) {
			System.out.print(i + " ");
		}
	}

}
/////////////
DuplicateRemoval
/////////////////
package ArraysDemo;

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
////////////////////
DuplicatesChar
/////////////////
package ArraysDemo;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "aaabbbcdddd";// "Great responsibility";
		System.out.println(str1);

		// Converts given string into character array
		char[] charArr = str1.toCharArray();
		// System.out.println(charArr[4]);

		System.out.println("Duplicate characters in a given string: ");
		int count = 0;

		// Counts each character present in the string
		for (int i = 0; i < charArr.length; i++) {
			count = 1;

			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					charArr[j] = '0';
				}
			}

			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && charArr[i] != '0')
				System.out.println(charArr[i]);
		}

		System.out.println(charArr);
		
		countDuplicateChar("aaabbccccdde");

	}

	public static void countDuplicateChar(String str) {
		
       //char [] charStr = str.toCharArray();
             
       HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
       //int count =0;
        
        for(int i=0; i< str.length(); i++){
        
        	if(!hmap.containsKey(str.charAt(i))) {
        		//count = count +1;
        		hmap.put(str.charAt(i), 1);
        	}else {
        		hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1 );
        	} 
		
        }
        System.out.println(hmap);
        
        //Print duplicates from map
        for(Map.Entry me : hmap.entrySet()) {
        	if( (int) (me.getValue()) > 1) {
        		System.out.println("Duplicate char: "+me.getKey() + ",  its counts: "+ me.getValue());
        	}
        }
	}

}
////////////
IntegerArray
//////////////
  package ArraysDemo;

public class IntegerArray {

	public static void main(String[] args) {
		
		String startDate = "2021-03-15T12:26:00.0"; 
		System.out.println(startDate.substring(0, 10));

		int[] myNums;  //Declaring integer array
		myNums = new int[10];  // Initializing array to be capable of holding 10 items.
		
		// Filling array with data
		int count = 0;
		for(int i=0; i<myNums.length; i++) {
			myNums[i] = count++;   // Use count first then increment it.
		}  // traversing array and get data.
		for(int a: myNums) {
			System.out.println(a);
		}
		
		System.out.println(" ------------------------- ");
		int[] nums1 = {10,20,30,40};  // Directly declaring and initializing array
		for(int a: nums1) {
			System.out.println(a);
		}
		
		System.out.println(" ------------------------- ");
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,0}; // Directly declaring and initializing array
		for(int a: nums) {
			System.out.println(a);
		}

		int n = 1232443343;
		System.out.println("sum of digits: "+ n + " is : "+ digitSum(n));

		int n1 = 5;
		System.out.println("sum of digits of all number: "+ n1 + " is : "+ digitSum(n1));
	}
	
	
	public static int digitSum(int n) {
		
		int sum = 0;
		
		//sum of digits goes from 0 to 9
		//while(n > 0){
		while(n > 0 || sum > 9) {
			
			if(n == 0) {
				n = sum;
				sum = 0;
			}
			
			sum = sum + n%10;  //get last digit from n and sum it
			
			n = n /10;  // get digit except last one
		}
		
		return sum;
	}

	
	public static int sumOfDigitsOfAllNumber(int n) {
		int sum = 0;
		for(int i=1; i<= n ; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
///////////////////
TestArrays
  /////////////////
  

package ArraysDemo;

public class TestArrays{
	
	public static void main(String args[]) {
	
		//Arrays
		System.out.println("This Arrays test demo!!!");
		
		int[] numbers = {1,5,9};
		System.out.println("Length of numbers array: "+ numbers.length);
	
		
		String[] city = {"Pune", "Delhi", "Hyderbad"};
		
		String[] cars = {"Volo", "BMW", "VW"};
		
//		System.out.println(cars[0] + " in city "+ city[0] + " number is "+ numbers[1]);

		System.out.println("Loop Through an Array...");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.print(city[i]);
			System.out.print(cars[i]);
			System.out.println();
		}
		
		//"for each" loop,
		for (String i : cars) {
			  System.out.println(i);
		}
		
		//multi-dimensional array
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		String[][] myStrings = {{"Pune","Delhi","Hyderabad"}, {"Volo","BMW", "VW"}};
		
		//Access Elements
		System.out.print(myNumbers[0][1]);
		System.out.print(myStrings[0][1]);
		System.out.println("Length of multi-dimensional array: "+ myStrings.length);
		
		System.out.println("Loop through multi-dimension: ");
		//Loop through multi-dimensional array
		for(int i=0 ; i<myStrings.length; i++) {
			System.out.println("---");
			for(int j=0; j<myStrings[i].length; j++) {
				System.out.println(myStrings[i][j]);
			}
		}
	}
}
  
