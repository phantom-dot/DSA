package array;

public class maxsubarry {

    static int func(int[]arr)
        { int res=arr[0];
            for( int i=0 ; i < arr.length-1 ; i++ )
                {
                   int  sum=0;
                    for( int j=i ; j < arr.length-1 ; j++ )
                        {
                            sum=+arr[j];

                            res=Math.max ( sum,res );

                        }
                }
            return res;
        }

    public static void main ( String[] args )
        {int arr[]={1,2,3,4,5,6,7};
            System.out.println (func ( arr ));
        }

}
