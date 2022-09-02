package strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class strings {

    public static String reverse(String s)
    {   char[] ss=s.toCharArray();
        int low=0;
        int high=ss.length-1;
        while(low<=high)
        {
            char temp=ss[low];
            ss[low]=ss[high];
            ss[high]=temp;
            low++;
            high--;
        }
       return String.valueOf(ss);
    }

    public static void main(String[] args) {
        int a=10;//reference variable a stores 10 in it

        String s="Let's take LeetCode contest";
        String[]ss= s.split(" ");
        StringBuilder j=new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            ss[i]=reverse(ss[i]);
        }
        Stream<String> stream=Arrays.stream(ss);
        String store=stream.collect(Collectors.joining(" "));
        System.out.println(store);
  }
}
