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
            System.out.print(charArrNames[i]);
        }
        System.out.println();
        String fruit = "Apple";

        char[] fruit_charArr = fruit.toCharArray();
        for(int i=fruit_charArr.length-1; i>=0; i--){
            System.out.print(fruit_charArr[i]);
        }
        System.out.println();

        String name1 = "Abhivardhan";
        List<String> list1 = new ArrayList<String>();
        list1.add(name1);
        System.out.println(list1.get(0));


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
