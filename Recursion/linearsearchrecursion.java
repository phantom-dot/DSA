package Recursion;

public class linearsearchrecursion {
    static int function(int []arr,int find,int i)
    {

        if (i>arr.length-1)
            return -1;

        if(arr[i]==find)
            return i;
        else {
            return function(arr, find, i + 1);
        }


    }
    public static void main(String[] args) {
    int[] ar={1,2,3,3,3,3,4,5,6};
        System.out.println(function(ar,3,0));
    }
}
