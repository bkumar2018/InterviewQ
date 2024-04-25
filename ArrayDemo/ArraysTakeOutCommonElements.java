package InterviewQ.ArrayDemo;

import java.util.*;

public class ArraysTakeOutCommonElements {

    public static void main(String[] args) {

        // 1. Common elements int arrays
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {100, 200, 10, 30};
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
        String[] strArray1 = {"Java", "Scala", "Python"};
        String[] strArray2 = {".Net", "Scala", "Clojure", "Java", "Java Script", "Python"};

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

    public static class DuplicatesChar {

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
}
