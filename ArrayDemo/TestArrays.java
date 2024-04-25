package InterviewQ.ArrayDemo;

import java.util.HashMap;
import java.util.Map;

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
  
