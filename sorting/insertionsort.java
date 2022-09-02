package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
            int [] arr={5,6,2,4,7,3,1};
        for (int i=1;i<arr.length;i++)
        {   int temp=arr[i];
            int j = i-1;
            for (; j >=0;j--) {

                if (arr[j]>temp)
                {   arr[j+1]=arr[j];
                }
                else
                    break;
            }

            arr[j+1]=temp;
        }

        System.out.println(Arrays.toString(arr));
     }
}

/*
why: adaptable, and stable algo, use when size of array is small,more good when array is partially sorted
in this we check every elment pos in left side array of it and we place it there
Time complexity
 O(n^2)
BEST CASE :O(n)
worst case: o(n^2)

Space complexity

O(1)


 */