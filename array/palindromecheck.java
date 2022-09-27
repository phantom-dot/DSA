package array;

public class palindromecheck {
    public static void main(String[] args) {

        System.out.println(palindrome(41));

    }

    public static boolean palindrome(int x)
    {
        char[] a=Integer.toString(x).toCharArray();
        int low=0,high=a.length-1;
        while(high>low)
        {
            if (a[low]!=a[high])
            {
                return false;
            }
            else low++;high--;
        }

        return true;
    }
}
