package sorting.qsns;

import java.util.Arrays;

public class sort01 {
    public static void main(String[] args) {
        int [] arr={0,1,1,1,0,0,1,1,0,1,0,0,1,0};
        int s=0;
        int e= arr.length-1;
        while (s<=e)
        {
            if (arr[s]>arr[e])
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            } else if (arr[s]==0) {
                s++;
            } else if (arr[e]==1) {
                e--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
