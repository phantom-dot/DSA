package sorting;
import java.util.*;

public class QuickSort
{
    static int partition(int[] arr, int s, int e)
    {
        int i=s;
        int j=e;
        int pivot=arr[s];
        while (i<j)
        {
            while(arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;

            if (i<j) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[j];
        arr[j]=arr[s];
        arr[s]=temp;
  return j;

    }




    static void quicksort(int[] arr, int s, int e)
    {
        //base case
        if (s>=e)
        {
            return;
        }

        int p=partition(arr,s,e);

        //left part sort
        quicksort(arr, s, p-1);

        //right part sort
        quicksort(arr,p+1,e);



    }

    public static void main(String[] args) {
        int[] arr ={2,4,1,6,9};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
