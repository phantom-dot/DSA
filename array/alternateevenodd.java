package array;

public class alternateevenodd{
    static int func ( int[] arr )
        {   int res=1;
            for (int i = 1; i < arr.length; i++)
            {
                int count=1;
                if((arr[i-1]%2==0 && arr[i]%2!=0) || (arr[i-1]%2!=0 && arr[i]%2==0))
                    {
                          count++;

                    }
                res=Math.max ( res,count );
            }
            return res;
        }
    public static void main ( String[] args )
        {
            int[] arr={1,1,1,1,1,1,1};
            System.out.println (func ( arr ));
        }
}
