package strings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class longest_substring_without_repeating_char {

    public static void main(String[] args) {
        String a="bbtablud";
        char arr[]=a.toCharArray();
//        int c=0;
//        int cmax=0;
//        boolean inc=false;
//        char fi=arr[0];
//        for (int i=1;i<arr.length-1;i++)
//        {
//            if (arr[i]!=arr[i+1])
//                cmax++;
//            if(arr[i]==fi || arr[i]==arr[i+1])
//            {   fi=arr[i];
//                c=Math.max(c,cmax);
//                cmax=0;
//                inc=true;
//            }
//        }
//
//        if (arr.length==0)
//            c=0;
        int i=0;
        int c=0;
        int cmax=0;
        Stack<Character> s=new Stack<>();
        while(i< arr.length)
        {
            if (s.contains(arr[i+1]) || arr[i]==arr[i+1])
                c=0;
            if (arr[i+1]!=arr[i])
            { cmax++;s.push(arr[i]);}
            

        }
        System.out.println(c);
    }

}
