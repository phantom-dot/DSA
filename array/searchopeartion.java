package array;
public class searchopeartion {


    static int search(int arr[],int size,int find)
    {
        for (int i = 0; i < size; i++) {
            if(arr[i]==find)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int size=arr.length;
        int find=5;
        int result=search(arr,size,find);

        if(result==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Found at index"+result);
        }


    }
}
