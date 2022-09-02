package array;
import java.util.Arrays;

public class leftrotatearraybyD {

    static int[] rbyd2(int arr[],int d)
    {
        
        int temp[]=new int[d];

        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[arr.length-d+i]=temp[i];
        }

        return arr;

    }













    static int[] leftr1(int []arr)
    {   int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            
            arr[i-1]=arr[i];
           
        }
        arr[arr.length-1]=temp;
        return arr;
    }



    static int[] rbyd(int arr[],int d)
    {

        for (int i = 0; i < d; i++) {
            leftr1(arr);
        }

        return arr;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        

        System.out.println(Arrays.toString(rbyd2(arr, 2)));
    }

}
