package array;

import java.util.Arrays;

public class delLeetcode {

   static int[] removeElement(int[] nums, int val) {

       int last=nums.length-1;


       int i=0 ;
       while (i <last) {

           if(nums[i]==val)
           {
               nums[i]=nums[last];
               last--;
           }
           i++;
       }


       return nums;
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(removeElement(arr, 2)));
    }




}
