package searching;

import java.util.Arrays;

public class firstANDlastoccofeleminsortedarray {
    static int first(int[]arr,int target)
    {   int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            if(arr[mid]>target)
                high=mid-1;
            if(arr[mid]<target)
                low=mid+1;


        }
        return ans;
    }

    static int last(int[]arr,int target)
    {       int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            if(arr[mid]>target)
                high=mid-1;
            if(arr[mid]<target)
                low=mid+1;


        }
        return ans;
    }


    static int[] searchRange(int[] arr, int target) {
        int arr1[]=new int[2];
        arr1[0]=first(arr,target);
        arr1[1]=last(arr,target);

        return arr1;

    }

    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }
}
