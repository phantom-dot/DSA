package array;

import java.util.HashMap;
import java.util.Map;

public class UNSOLVED {
    //find frequency of elements in array

    static HashMap<Integer,Integer> fr(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int counter=0;

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                continue;
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[i]==arr[j]) counter++;
                if (j==arr.length-1)
                {
                    map.put(arr[i],counter);
                }
            }
            counter=0;

        }
        return map;
        // Time complexity O(n^2)
        // space analysis O(n)
    }


    public static void countfreq(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println((k + " " + v));
        }
    }

    public static void main(String[] args) {
        int[] arr= {10, 20, 20, 10, 10, 20, 5, 20};
        countfreq(arr);



    }
}


