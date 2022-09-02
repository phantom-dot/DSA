package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class al {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);


        System.out.println( list.get(3));
        System.out.println(list);
    }

}
