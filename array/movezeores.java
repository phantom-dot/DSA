package array;
import java.util.Arrays;

public class movezeores {
    



    /*static int[] mocvezero(int arr[])
    {

        //naive soltion
        //bruteforce


        for (int i = 0; i < arr.length; i++) {
            

            if(arr[i]==0)
            {
                for (int j = i+1; j < arr.length; j++) {
                
                    if(arr[j]!=0)
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                        
                    }

                }
    
            }

            

        }

        



        return arr;
    }*/






    static int[] mocvezero(int arr[])
    {

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                        arr[i]=arr[count];
                        arr[count]=temp;
                  count++;      
            }
        }
        return arr;
// 1 0 2 0 3 0 4 0
    } 

//    static int[] movez(int arr[])
//    {   int zeroes=0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0)
//                zeroes++;
//        }
//        int nonzeores=arr.length-zeroes;
//        int temp[]=new int[nonzeores];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=0)
//                temp[i]=arr[i];
//        }
//        for (int i = 0; i < zeroes; i++) {
//            arr[i]=0;
//        }
//        for (int i = zeroes; i < arr.length ; i++) {
//            arr[i]=temp[i];
//        }
//        return arr;-
//    }
//




    public static void main(String[] args) {
        

        int arr[]={1,0,2,0,3,0,4,0};
//        System.out.println(Arrays.toString(movez(arr)));


    }


    
    





}
