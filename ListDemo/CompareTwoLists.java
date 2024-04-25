package InterviewQ.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CompareTwoLists {

    public static void main(String[] args) {

//		List<String> lstOne = new ArrayList<String>();
//		List<String> lstTwo = new ArrayList<String>();



        compare2SortedListWithSameItemsAndAppearAtSameIndex();

        System.out.println(" ------------------------------------------------ ");
        compare2SortedListsForEqualityRegardlessOfTheirLocation();

        System.out.println(" ------------------------------------------------ ");
        compare2ListsAndFindDifferences();



    }



    public static void compare2SortedListWithSameItemsAndAppearAtSameIndex() {
        //Two compare two sorted list with same items and appear in the same index
        //equals() method compares the items and their location in the list.
        List<String> lstOne = Arrays.asList("a", "b", "c");
        List<String> lstTwo = Arrays.asList("a", "b", "c");
        List<String> lstThree = Arrays.asList("c", "a", "b");

        boolean isEqual = lstOne.equals(lstTwo);
        System.out.println(isEqual);
        isEqual = lstOne.equals(lstThree);
        System.out.println(isEqual);

        if(lstOne.equals(lstTwo)) {
            System.out.println("lstOne equals lstTwo");
        }else if (lstOne.equals(lstThree)) {
            System.out.println("lstOne equals lstThree");
        }else {
            System.out.println("No list is equals");
        }
    }


    public static void compare2SortedListsForEqualityRegardlessOfTheirLocation() {

        List<String> lstOne = Arrays.asList("a", "b", "c");
        List<String> lstTwo = Arrays.asList("a", "b", "c");
        List<String> lstThree = Arrays.asList("c", "a", "b");

        //Compare two sorted lists for equality in terms of items regardless of their location,
        Collections.sort(lstOne);
        Collections.sort(lstTwo);
        Collections.sort(lstThree);

        boolean isEqual_sort = lstOne.equals(lstTwo);
        System.out.println(isEqual_sort);
        isEqual_sort = lstOne.equals(lstThree);
        System.out.println(isEqual_sort);
    }

    public static void compare2ListsAndFindDifferences() {


        //Compare two lists and find differences.
        List<String> lstOne = Arrays.asList("a", "b", "c");
        List<String> lstTwo = Arrays.asList("a", "b", "c");
        List<String> lstThree = Arrays.asList("c", "a", "b");

        //removeAll()  -->  method compares two lists and removes all the common items.
        List<String> lstFour = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        lstFour.removeAll(lstOne);
        System.out.println("removeAll --> "+lstFour);


        //retainAll() ---> method only keeps the items that are common in both  lists.
        lstOne.retainAll(lstThree);
        System.out.println("retainAll --> "+lstOne);

    }

}
