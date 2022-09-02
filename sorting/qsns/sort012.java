package sorting.qsns;

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,2,0,1,0,0,1,2,0,1};
        int l=0;
        int r= arr.length-1;
        int i=0;
        while (i<=r)
        {
            if (arr[i]==0)
            { int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
            i++;
            l++;
            }

            else if (arr[i]==2)
            {
                int temp=arr[i];
                arr[i]=arr[r];
                arr[r]=temp;
                r--;
            }
            else i++;

        }
        System.out.println(Arrays.toString(arr));
    }
}
