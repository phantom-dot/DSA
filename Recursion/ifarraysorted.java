package Recursion;

public class ifarraysorted {
    public static void main(String[] args) {
        int []arr={1,2,5,4,5,6};
        System.out.println(func(arr,0));
    }

    static boolean func(int[] arr,int i)
    {
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]<arr[i+1]) {
            return func(arr,i+1);
        }
       return false;
    }
}
