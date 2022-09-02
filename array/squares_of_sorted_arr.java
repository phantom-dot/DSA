package array;

import java.util.Arrays;

public class squares_of_sorted_arr {
    static int[] sq(int arr[])
    {
       int start=0;
       int end=arr.length-1;
       int res[]=new int[arr.length];
       int endr=arr.length-1;
       while (start<=end)
       {
           if (Math.abs(arr[start])>=Math.abs(arr[end]))
           {
               res[endr]=Math.abs(arr[start]*arr[start]);
               start++;
           }
           else
           { res[endr]=Math.abs(arr[end]*arr[end]); end--;
           }
           endr--;
       }

        return res;
    }
    public static void main(String[] args) {
        int[] arr ={-7,-4,-1,0,3,10};
        System.out.println(Arrays.toString(sq(arr)));
    }





}
