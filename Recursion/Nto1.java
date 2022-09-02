package Recursion;

import com.sun.source.tree.BreakTree;

public class Nto1 {
    static void func(int a)
    {
        if (a==0) return;
        System.out.println(a);
        func(a-1);

    }




    public static void main(String[] args) {
        func(6);
    }
}
