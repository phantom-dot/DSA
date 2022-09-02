package Recursion;

public class OnetooN {

static void func(int a)
{
    if (a==0) return;
    func(a-1);
    System.out.println(a);


}
    public static void main(String[] args) {
        func(5);
    }
}
