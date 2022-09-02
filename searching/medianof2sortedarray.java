package searching;

import java.util.Arrays;



public class medianof2sortedarray {
    /*
    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    The overall run time complexity should be O(log (m+n)).
    */
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        double ans=0;
//        int[] merge =new int[nums1.length+nums2.length];
//        System.arraycopy(nums1,0,merge,0,nums1.length);
//        System.arraycopy(nums2,0,merge,nums1.length,nums2.length);
//
//
//        Arrays.sort(merge);
//        int mid=merge.length/2;
//
//        if(merge.length%2==0)
//        {
//
//            double val1=merge[mid];
//            double val2=merge[mid-1];
//            ans=(val1+val2)/2;
//        }
//        if(merge.length%2!=0)
//        {
//            ans= merge[mid];
//
//        }


        double ans=0;
        int[] merge =new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]<=nums2[j]) {
                merge[k] = nums1[i];
                i++;

            }
            else
            {
                merge[k]=nums2[j];
                j++;

            }
            k++;
        }

        if(i>=nums1.length)
        {
            while(j<nums2.length) {merge[k]=nums2[j];
            j++;
            k++;}

        }
        if(j>=nums2.length)
        {
            while(i<nums1.length)
            {merge[k]=nums1[i];
            i++;
            k++;}
        }

        int mid=merge.length/2;

        if(merge.length%2==0)
        {

            double val1=merge[mid];
            double val2=merge[mid-1];
            ans=(val1+val2)/2;
        }
        if(merge.length%2!=0)
        {
            ans=merge[mid];


        }
//
//

        return ans;
    }



    public static void main(String[] args) {
        int []a={1,2};
        int []b={3,4};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
