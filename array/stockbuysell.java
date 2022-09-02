package array;
public class stockbuysell {

    static int stock(int arr[]) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                profit = profit + arr[i] - arr[i - 1];

        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 12 };
        System.out.println(stock(arr));

    }
}
