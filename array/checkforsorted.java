package array;
public class checkforsorted {


    static boolean check(int arr[])
    {
        
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]<arr[i-1])
            {
                
               return false;
                
            }
           
        }
       return true;
    }
    public static void main(String[] args) {
        int arr[]={4,6,4,1};
        boolean result=check(arr);
        if(result==false)
        {
            System.out.println("array is not sorted");
        }
        if(result==true)
        System.out.println("array is sorted");
        
    }
}
