package DAA_04_Arrays;

import java.util.Arrays;

public class L_05_LeaderInAnArray {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,8,11,10};
        //int arr[] = {7, 10, 4, 3, 6, 5, 2};
        int arr[] = {30, 20 , 20, 10};
        System.out.println(arr[arr.length-1]);
        for (int arrInd = arr.length - 2; arrInd >= 0; arrInd--) {
            if (arr[arrInd] <= arr[arrInd + 1]) {
                arr[arrInd] = arr[arrInd + 1];
            } else {
                System.out.println(arr[arrInd]);
            }
        }
    }
}




















