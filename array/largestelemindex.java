package array;
public class largestelemindex {

    static int function(int arr[])
    {
        
        int result=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[result])
            {
                result=i;
                
            }

            


            
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,10};
        int result=function(arr);
        System.out.println(result);
    }
}
