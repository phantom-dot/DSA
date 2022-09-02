package array;
public class leadersinarr {

    static void leaders2(int arr[])
    {
        //optimized soln
        int cuurl=arr[arr.length-1];
        System.out.println(cuurl);
        for (int i = arr.length-2; i >=0; i--) {
            
            if(arr[i]>cuurl){
                cuurl=arr[i];
                System.out.println(arr[i]);
            }


        
        }
        
    }















    
    static void leaders(int arr[])
    {   

        //bruteforce approach

        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>=arr[i]) {
                    flag=false;
                    break;
                }
                
            }
            if(flag==true)
            System.out.println(arr[i]);
            
        } 

        
    }

    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        leaders2(arr);
    }
}
