package array;

public class maxone {
    static int function(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0)
                count = 0;

            else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arrr[] = { 0, 1, 1, 0, 1, 1, 1, 1, 0 };
        System.out.println(function(arrr));
    }
}