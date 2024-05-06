package InterviewQ.ArrayDemo.test;

import java.util.*;

public class TestArray {
    public static void main(String args[]){
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars.length);
        System.out.println(Arrays.stream(cars).count());
        System.out.println(cars[0]);

        System.out.println();
        for( String s: cars){
            System.out.println(s);
        }

        String[] arrStr = {"Apple", "Orange", "Banana", "Grapes"};
        int n = arrStr.length;

        reverseArr(arrStr,0,n-1);
        for(String s: arrStr){
            System.out.println("="+ s);
        }

        String name = "Birender";
        char[] charArrNames = name.toCharArray();
        for(int i = charArrNames.length-1 ; i >= 0 ; i-- ){
            System.out.println(charArrNames[i]);
        }



    }



    // This method is used for reversing the array of String using start and end index.
    public static void reverseArr(Object[] arr, int start, int end){
        if(arr == null || end == 0) return;

        while(start < end){
            Object temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
