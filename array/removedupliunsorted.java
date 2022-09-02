package array;
import java.util.Arrays;

public class removedupliunsorted {
    


    static int [] remove(int arr[],int s)
    {
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[i]==arr[j])
                {
                   for (int j2 = j+1; j2 < arr.length; j2++) {
                   arr[j]=arr[j+1];
                   }
                }
            }
        }
         return arr;
    }


    public static void main(String[] args) {
        int arr[]={10,20,20,30,30,30};
        System.out.println(Arrays.toString(remove(arr, 6)));
    }


}
