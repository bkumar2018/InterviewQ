package InterviewQ.ArrayDemo.test;

import java.util.Arrays;

public class FindMinMaxInArray {


    public static void main(String[] args){

        int[] arr = {1,423,6,46,56,34,23,12,34,53,4};
        int n = arr.length;

        int max = 0;
        for(int i = 0; i< n-1; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element in given array: "+ max);

        Arrays.sort(arr);
        System.out.println("Min element in given array: "+ arr[0]);
        System.out.println("Max element in given array: "+ arr[n-1]);

//        System.out.println("Min element in given array: "+ Arrays.stream(arr).min().getAsInt());
//        System.out.println("Min element in given array: "+ Arrays.stream(arr).max().getAsInt());


    }
}
