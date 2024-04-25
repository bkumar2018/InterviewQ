package InterviewQ.ArrayDemo;

public class IntegerArray {

    public static void main(String[] args) {

        String startDate = "2021-03-15T12:26:00.0";
        System.out.println(startDate.substring(0, 10));

        int[] myNums;  //Declaring integer array
        myNums = new int[10];  // Initializing array to be capable of holding 10 items.

        // Filling array with data
        int count = 0;
        for (int i = 0; i < myNums.length; i++) {
            myNums[i] = count++;   // Use count first then increment it.
        }  // traversing array and get data.
        for (int a : myNums) {
            System.out.println(a);
        }

        System.out.println(" ------------------------- ");
        int[] nums1 = {10, 20, 30, 40};  // Directly declaring and initializing array
        for (int a : nums1) {
            System.out.println(a);
        }

        System.out.println(" ------------------------- ");
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; // Directly declaring and initializing array
        for (int a : nums) {
            System.out.println(a);
        }

        int n = 1232443343;
        System.out.println("sum of digits: " + n + " is : " + digitSum(n));

        int n1 = 5;
        System.out.println("sum of digits of all number: " + n1 + " is : " + digitSum(n1));
    }


    public static int digitSum(int n) {

        int sum = 0;

        //sum of digits goes from 0 to 9
        //while(n > 0){
        while (n > 0 || sum > 9) {

            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum = sum + n % 10;  //get last digit from n and sum it

            n = n / 10;  // get digit except last one
        }

        return sum;
    }


    public static int sumOfDigitsOfAllNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
