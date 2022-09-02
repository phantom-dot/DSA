package array;

import java.util.Arrays;

public class right_rotate_arr_byK {

    static int[] reverse(int [] arr,int s,int e)
    {
        //1 2 3 4 5 6 7
        if (arr.length==1)
            return arr;
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }

    static int[] roratearr1(int [] arr,int k)
    {
        // 1 2 3 4 5 6 7
        //1 2 3 4
        if (k>arr.length)
            k=k%arr.length;

        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        return  arr;
    }



    static int[] rotatearr(int[] nums, int k)
    {
        if (k<=0 || nums.length==1)
            return nums;
        if (nums.length<k)
            k=k% nums.length;
        int[]karr=new int[k];

        System.arraycopy(nums, nums.length - k, karr, 0, k);
        System.arraycopy(nums, 0, nums, 0 + k, nums.length - k - 1 + 1);
        System.arraycopy(karr, 0, nums, 0, k);

        //1 2 3 4 5 6 7
        // O(n) Time and O(1) space

    return nums;
    }

    public static void main(String[] args) {

        int arr[]={1,2};

        //
        System.out.println(Arrays.toString(roratearr1(arr,3)));
    }
}
