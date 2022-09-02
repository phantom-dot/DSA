package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {

        int[] arr ={6,2,8,4,10};


        for (int i=0;i<arr.length-1;i++)
        {
            for (int j = i+1; j < arr.length;j++) {

                if (arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

/*

Time complexity
Best case: array is already sorted O(n^2)
worst case :not s single elem is at already sorted pos O(n^2)
space complexity: o(1)

when to use :
when array size is small

*/