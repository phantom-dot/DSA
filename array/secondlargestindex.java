package array;

public class secondlargestindex {




    static int function(int[] arr)
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

    static int function2(int[] arr)
    {
         int largest=function(arr);

         int result=0;

         for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[largest])
            continue;
            if(arr[i]>arr[result])
            {
                result=i;
                
            }

         }

         return result;
        
    }

    public static void main(String[] args) {
        int[] arr ={20,20,10};
        int res=function2(arr);
        System.out.println(res);
    }
}
