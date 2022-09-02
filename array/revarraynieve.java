package array;
import java.util.Arrays;

public class revarraynieve {
    

    static int[] rev(int arr[])
    {
        int high=0;
        int low=arr.length-1;
        while(high!=low)
        {
           int t;
           t=arr[high];
           arr[high]=arr[low];
           arr[low]=t;
           low--;
           high++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(rev(arr)));
        
    }

}
