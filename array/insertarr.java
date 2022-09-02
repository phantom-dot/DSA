package array;

public class insertarr{

    static void dlt ( int size , int[] arr )
        {
            for( int i=0 ; i < arr.length ; i++ )
                {
                    if( arr[i]==8 )
                        {
                            for( int j=i+1 ; j < arr.length ; j++ )
                                {
                                    if( j==arr.length-1 )
                                        {
                                            break;
                                        }
                                    arr[j]=arr[j+1];
                                    size--;

                                }


                        }
                }

            for( int i=0 ; i < arr.length ; i++ )
                {
                    System.out.println ( arr[i] );
                }


        }

    public static void main ( String[] args )
        {
            int[] arr={ 3 , 8 , 12 , 5 , 6 };
            dlt ( arr.length , arr );


        }
}
