package array;
public class maxdiff {








    static void max(int arr[])
    {

        //bruteforce approach
        //o(n2)

        int diff=0;
        for ( int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]-arr[i]>diff)
                {
                    diff=arr[j]-arr[i];
                }
            }
        }
        System.out.println(diff);
    }



    public static void main(String[] args) {
        int arr[]={7,9,5,6,3,2};
        max(arr);
    }
}
