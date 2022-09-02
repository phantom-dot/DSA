package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twopairsum {

    static int[] hash(int[] arr, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] ans=new int[2];
        for (int i = 0; i <arr.length; i++) {
            if (map.containsKey(k-arr[i]))
            {
                ans[0]=i;
                ans[1]=map.get(k-arr[i]);
                break;
            }
            else
                map.put(arr[i],i);
        }

return ans;
    }

    static int[] set(int[] arr, int k)
    {
        HashSet<Integer> set=new HashSet<Integer>();
        int[] ans=new int[2];
        for (int i = 0; i <arr.length; i++) {
            if (set.contains(k-arr[i]))
            {
                ans[0]=arr[i];
                ans[1]=k-arr[i];
                break;
            }
            else
                set.add(arr[i]);
        }
        if (ans[0]==0 && ans[1]==0)
            System.out.println("no such pair present");
        return ans;
    }

    static void usingbinarysearch(int[] arr, int k)
    {   Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int find=k-arr[i];
            int low=0;
            int high=arr.length-1;
            while(low<=high)
            {   int mid=(low+high)/2;
                if (arr[mid]==find)
                { System.out.println(arr[i]+"+"+arr[mid]+"="+k);
                    break;}
                else if (find>arr[mid])
                    low=mid+1;
                else
                    high=mid-1;
            }


        }
    }

    static void itreative(int arr[],int k)
    {
        int ans[]=new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==k)
                {System.out.println(arr[i]+"+"+arr[j]+"=" +k);
                    ans[0]=arr[i];
                    ans[1]=arr[j];

                }

            }
        }

    }


    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        int find=9;
        System.out.println(Arrays.toString(hash(arr, find)));
    }


}
