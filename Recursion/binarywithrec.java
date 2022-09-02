package Recursion;

public class binarywithrec {
    static int bin(int[]arr,int find,int low,int high)
    {

        if (low>high)
        {
            return -1;
        }
            int mid=(low+high)/2;
            if (arr[mid]==find)
                return mid;
            else if (arr[mid]>find)
               return bin(arr, find, low, mid-1);
            else return bin(arr, find, mid+1, high);


    }


    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        System.out.println(bin(arr,2,0, arr.length-1));
    }
}
