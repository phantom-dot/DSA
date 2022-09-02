package searching;

public class binarysearch{
    static int binarysearc ( int[] arr , int x )
        {
           int low=0;
            int high=arr.length-1;
            while (low <= high)
                {
                    int mid=(low+high) / 2;
                    if( arr[mid]==x ) return mid;
                    else if( arr[mid] > x ) high=mid-1;
                    else low=mid+1;
                }
            return -1;
        }

    // Driver code
    public static void main ( String[] args )
        {
            int[] arr={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
            int x=5;
            int result=binarysearc ( arr , x );
            System.out.println ( result );
        }

}


