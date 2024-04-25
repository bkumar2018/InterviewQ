package InterviewQ.ArrayDemo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Object[] data = new Object[5];
        data[0] = "Hello";
        data[1] = 100;
        data[2] = 19.50;
        data[3] = false;
        data[4] = true;


        Object data1 = new Object();
        data1 = "Somedata";
        System.out.println(data1.toString());

        //Object[] objArr = new Object[5];

        System.out.println(data); // [Ljava.lang.Object;@182decdb

        //print all data from the object data
        for (Object o : data) {
            System.out.println(o);
        }

        intArrayDemo();
        System.out.println();

        int a[] = {10, 4, 11, 7, 6, 20};
        int k = 2;
        int n = a.length;
        System.out.println("Array to sort except one: ");
        for (Object o : a) {
            System.out.print(" " + o);
        }
        System.out.println();
        sortExceptOne(a, k, n);
//		for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
        for (Object o : a) {
            System.out.print(" " + o);
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
        a[k] = a[n - 1];
        a[n - 1] = temp;
        System.out.println();
        for (Object o : a) {
            System.out.print(" " + o);
        }
        System.out.println();

        // Sort all elements except last
        Arrays.sort(a, 0, n - 1);

        // Store last element (originally k-th)
        int last = a[n - 1];

        // Move all elements from k-th to one
        // position ahead.
        for (int i = n - 1; i > k; i--)
            a[i] = a[i - 1];

        for (Object o : a) {
            System.out.print(" " + o);
        }
        System.out.println();

        // Restore k-th element
        a[k] = last;

        System.out.println();
    }

    public static void intArrayDemo() {
        System.out.println("int aray demo...");

        //array with data initialize in the beginning
        int[] arryInt = {10, 60, 50, 90, 80, 20, 30};
        System.out.println(arryInt);

        System.out.println(Arrays.asList(arryInt));

        //array initialize with some size and later provided data.
        int[] arrIntb = new int[5];
        arrIntb[0] = 10;
        arrIntb[1] = 12;
        arrIntb[2] = 15;

        for (int i : arryInt) {
            System.out.print(i + " ");
        }
        System.out.println("------");
        for (int j : arrIntb) {
            System.out.print(j + " ");
        }

        Integer[] intArr = new Integer[5];
        intArr[0] = 101;
        intArr[1] = 103;
        intArr[2] = 105;
        intArr[3] = 103;
        List<Integer> list = Arrays.asList(intArr);
        System.out.println(list.size());
        for(Integer i : list){
            System.out.println(i);
        }

    }
}
