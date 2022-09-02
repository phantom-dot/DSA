package array;

public class max_and_min {
    public static void main(String[] args) {
        int arr[]={11,2,5,3,7,2,200};
        int min=arr[0];
        int max=arr[0];
        int mini=0;
        int maxi=0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i]>=max)
            {
                max=arr[i];
                maxi=i;
            }
            else {min=arr[i];mini=i;}
        }

        System.out.println(mini+" "+maxi);
    }
}
