package sorting.qsns;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergesortedarrays {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;
        // very basic approach
        // System.arraycopy(nums2,0,nums1,m,n);
        // Arrays.sort(nums1);

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];

            }
            else
            { nums1[k--]=nums2[j--];}

        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }

        int arr[]=new int[10];
        Arrays.fill(arr,3);
    }
}
