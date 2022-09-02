package array;

public class majorityelem {
    static void func(int[] arr) 
    {

        for (int i = 0; i < arr.length; i++) 
        {
            int count = 1;
            
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                }

                if (count >= (arr.length) / 2) 
                {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 7, 4, 7, 7, 5 };
        func(arr);
    }

}
