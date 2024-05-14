package InterviewQ.ArrayDemo.test;

import java.util.Stack;

public class ReverseAnArray {


    public static void reverWithStack(int[] arr, int n){

        Stack<Integer> stack = new Stack<>();
        //Push element on the stack
        for(int i=0; i<=n-1; i++){
            stack.push(arr[i]);
        }

        //Pop elements from stack to reverse the array
        for(int i=0; i<=n-1; i++){
            arr[i] = stack.pop();
        }

    }

    public static void main(String[] args){
        int[] arr = {10,45,60,40};
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }

        int[] arr1 = {10,20,30,40,50};
        reverWithStack(arr1, arr1.length);
        System.out.print("Reversed Array: ");
        for (int element : arr1) {
            System.out.print(element + " ");
        }
    }
}
