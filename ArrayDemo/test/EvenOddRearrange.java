package InterviewQ.ArrayDemo.test;

public class EvenOddRearrange {

    public  static  void main(String[] args){

        int[] nums = {3, 1, 2, 4, 6, 5, 7, 8};

        rearrange(nums);
        for(int i: nums){
            System.out.println(i);
        }

    }

    public static void rearrange(int[] inArr){

        int n = inArr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            if(inArr == null || inArr.length ==0 ) return ;

            while(left < right && inArr[left]%2 ==0 ){
                left++;
            }

            while(left < right && inArr[right]%2 !=0 ){
                right--;
            }

            if (left < right) {
                int temp = inArr[left];
                inArr[left] = inArr[right];
                inArr[right] = temp;
                left++;
                right--;
            }
        }
    }

}
