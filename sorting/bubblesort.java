package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr ={1,10,7,4,8,2,11};
        boolean swapped=false; //this bool is used to optimize the code if array is already sorted then we will do nothing;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped =true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        var value=7;
        System.out.println(value);
        System.out.println(Arrays.toString(arr));
    }
}

//IN BUBBLE SORT WE CHECK EVERY PAIR
//and in very iteration the largest value is moved to end
// to be used when we have a small number of data
/*

Time-complexity
   AVG CASE : O(n^2)
   BEST CASE : O(N) IF OPTIMIZED USING BOOLEAN AS ABOVE
   WORST CASE :O(n^2)
   stable sort: yes


Space complexity
   O(1)





 */
