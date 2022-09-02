package strings;

import java.util.HashSet;
import java.util.Set;

public class permuation_of_s1_in_s2 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "scfsabdcvsdab";
        int count = 0;
        int maxc = 0;
        boolean is = false;
        int start = 0;
        int end = s1.length() - 1;
        HashSet<Character> s = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            s.add(s1.charAt(i));
        }
        //scfsabdcvsdab

            for (int i = 0; i < s2.length(); i++) {
                while (start!=end){
                    if (s.contains(s2.charAt(start)))
                        start++;
                }

            }

        if (s1.length()==1)
        {
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i)==s1.charAt(0))
                {
                    is=true;
                }
            }
        }



        System.out.println(is);
    }
}
