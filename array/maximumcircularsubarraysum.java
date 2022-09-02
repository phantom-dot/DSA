package array;

public class maximumcircularsubarraysum {
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

        static int func2(int[]arr)
        { int res=arr[0];
            for( int i=arr.length-1 ; i >=0 ; i-- )
                {
                   int  sum=0;
                    for( int j=i ; j >=0 ; j-- )
                        {
                            sum=+arr[j];

                            res=Math.max ( sum,res );

                        }
                }
            return res;
        }


}
