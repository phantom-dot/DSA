package array;
public class trappingrainwater {
    

   
    static int trapping(int arr[])
    {
        
        int secondlargestelem=2;
        int sum=0;
        for (int i = 1; i <  arr.length-1; i++) {
            if (arr[i]>secondlargestelem)
            {
                continue;
            }
            if((arr[i-1]>=arr[i+1] || arr[i-1]<=arr[i+1]) && (arr[i-1]>=arr[i] && arr[i+1]>=arr[i])) {
                sum = sum + secondlargestelem - arr[i];

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( trapping(arr));
    }

}
