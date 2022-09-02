package array;
public class UNSOLVED {
    //find frequency of elements in array

    static void fr(int[] arr) {
        int count=1;
        int i=1;
       while (i<arr.length-1)
       {
             while (i<arr.length-1 && arr[i]==arr[i-1])
                 {
                     count++;
                     i++;
                 }
           System.out.println (arr[i-1]+" "+count);
           i++;
           count=1;

       }
        if( arr.length-1==1 || arr[arr.length-1]!=arr[arr.length-2] )
            {
                System.out.println (arr[i-1]+" "+1);
            }
    }
    public static void main(String[] args) {
        int[] arr= {40,50,50,90,90};
        fr(arr);
    }
}

