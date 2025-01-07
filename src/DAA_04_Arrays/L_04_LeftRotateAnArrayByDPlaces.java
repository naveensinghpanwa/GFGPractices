package DAA_04_Arrays;

import java.util.Arrays;

public class L_04_LeftRotateAnArrayByDPlaces {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int toRotatePlaceSize = 5;
        reverse(arr, 0 , arr.length-toRotatePlaceSize);
        reverse(arr, arr.length-toRotatePlaceSize+1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int ind1, int ind2) {
        for (int i = ind1, j = ind2; i <= j; i++, j--) {
            int tempVar = arr[i];
            arr[i] = arr[j];
            arr[j] = tempVar;
        }
    }
}




















