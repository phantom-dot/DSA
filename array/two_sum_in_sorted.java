package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class two_sum_in_sorted {
    static int[] sum(int arr[],int s)
    {//1 2 3 4 5 6
        int []ans=new int[2];
        HashSet<Integer> set=new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(s-arr[i]))
            {
                ans[0]=arr[i];
                ans[1]=s-arr[i];
                break;
            }
            else
                set.add(arr[i]);
        }

     return ans;
    }

    static int[] twopointers(int arr[],int s)
    {
        int ans[]=new int[2];
        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int sum=arr[low]+arr[high];
          if (sum>s)
          {
              high--;
          }
          if (sum<s)
              low++;
          if (sum==s){
                ans[0]=arr[low];
                ans[1]=arr[high];
                break;
          }
        }
        return ans;
    }
    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(twopointers(arr, 9)));
    }
}
