package array;

import java.util.Arrays;

public class set_matrix_zero {
//    static void setzero(int[][] arr)
//    {
//        int row=arr.length;
//        int col=arr[0].length;
//        boolean rowflag=false;
//        boolean colflag=false;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (arr[i][j]==0)
//                {
//                    if (i==0)
//                        rowflag=true;
//                    if (j==0)
//                        colflag=true;
//                    arr[i][0]=0;
//                    arr[0][j]=0;
//                }
//            }
//        }
//        for (int i = 1; i < row; i++) {
//            for (int j = 1; j < col; j++) {
//                if (arr[i][0]==0 || arr[0][j]==0)
//                    arr[i][j]=0;
//            }
//        }
//        if (rowflag)
//        {
//            for (int i = 0; i < col; i++) {
//                arr[0][i]=0;
//            }
//        }
//        if (colflag)
//        {
//            for (int i = 0; i < row; i++) {
//                arr[i][0]=0;
//            }
//        }
//    }

    static void setzero(int[][] arr)
    {
        int col=0;
        int row=0;
        boolean z=false;
        for (int i = 0; i < arr.length; i++) {
            z=false;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==0)
                {//        [[0,0,0,5],[4,3,1,4],[0,1,1,4],[1,2,1,3],[0,0,1,1]]
                    col=j;
                    row=i;
                    setcolz(arr,col);
                    z=true;

                }

            }
            if (z)
            {setrowz(arr,row);}
        }


    }

    static void setcolz(int arr[][],int col)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col]!=0)
            {
            arr[i][col]=Integer.MIN_VALUE;}
        }
    }

    static void setrowz(int arr[][], int row)
    {
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[row][i]!=0){
            arr[row][i]=Integer.MIN_VALUE;}
        }
    }



    public static void main(String[] args) {
                    int arr[][]={{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
//        [[0,0,0,5],[4,3,1,4],[0,1,1,4],[1,2,1,3],[0,0,1,1]]
                    setzero(arr);
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            if (arr[i][j]==Integer.MIN_VALUE )
                            {
                                arr[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
