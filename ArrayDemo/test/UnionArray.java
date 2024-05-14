package InterviewQ.ArrayDemo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class UnionArray {


    public static ArrayList<Integer> uninonArr(int[] arr1, int[] arr2, int m, int n){

        // Maintains elements in sorted order
        TreeSet<Integer> set = new TreeSet();

        // Remove the duplicates from arr1[]
        for(int i: arr1){
            set.add(i);
        }

        // Remove the duplicates from arr2[]
        for(int i: arr2){
            set.add(i);
        }
        // Loading set to array list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: set){
            list.add(i);
        }
        return list;
    }

    public static ArrayList<Integer> intersectionArr(int[] arr1, int[] arr2, int m, int n){

        HashSet<Integer> hset = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        ArrayList<Integer> intersectList = new ArrayList<>();

        for(int i = 0 ; i< m; i++ ){
            if(!hset.add(arr1[i])) {
                intersectionSet.add(arr1[i]);
            }
        }

        for(int i = 0 ; i< n; i++ ){
            if(!hset.add(arr2[i])) {
                intersectionSet.add(arr2[i]);
            }
        }
        for(int i: intersectionSet){
            intersectList.add(i);
        }
        return  intersectList;
    }

    public static void main(String[] args){

        int[] arr1 = { 1, 9,5,2, 2, 2, 3 };
        int[] arr2 = {2, 3, 3, 4, 5, 5 };
        int m = arr1.length;
        int n = arr2.length;

        System.out.println("Union of 2 arrays :");
        ArrayList<Integer> union = uninonArr(arr1, arr2, m, n);
        for(int i: union){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("Intersection of 2 arrays :");
        ArrayList<Integer> intersec = intersectionArr(arr1, arr2, m, n);
        for(int i: intersec){
            System.out.print(i +" ");
        }

    }
}
