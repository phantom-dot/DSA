package array;
import java.util.Arrays;
public class leftrotatearrby1 {
    
    static int[] leftr(int []arr)
    {   int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            
            arr[i-1]=arr[i];
           
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={3,2,4,2,6,3};
        System.out.println(Arrays.toString(leftr(arr)));
        
    }

}
