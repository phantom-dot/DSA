package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countofsmallernumafterself {

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i< nums.length;i++)
        {   int counter=0;
            for(int j=i;j< nums.length;j++)
            {
                if(nums[j]<nums[i])
                    counter++;
                list.add(counter);

            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={5,2,6,1};


    }


}
