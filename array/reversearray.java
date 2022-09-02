package array;

import java.util.Scanner;

class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int l = n - 1; l >= 0; l--) {
                System.out.print(arr[l] + " ");
            }

            t--;
        }
        sc.close();
    }

}
