package DAA_04_Arrays;

public class L_06_MaxDiff {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,8,11,10};
        //int arr[] = {7, 10, 4, 3, 6, 5, 2};
        //int arr[] = {30, 20 , 20, 10};
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        //int arr[] = {8, 8, 8, 8, 8, 8, 8};

        int maxDiff = arr[1] - arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]-arr[i-1] > maxDiff) {
                index = i;
            }
        }

        System.out.println(arr[index]);

    }
}




















