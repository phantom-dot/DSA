package searching;

public class peakindexinmountainarr {

    static int peakIndexInMountainArray(int[] arr) {
        int i=0;
       while (arr[i]<arr[i+1])
           i++;
       return i;
    }
    public static void main(String[] args) {
        int arr[]={0,1,9,2};
        System.out.println(peakIndexInMountainArray(arr));
    }


}
