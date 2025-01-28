package DAA_06_Sorting;

import java.util.Arrays;
import java.util.Random;

/**
    Sort an array with three types of elements
 */
public class L_06_SortingWithThreeTypesOfElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 1, 2};
        sort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);
    }

    static void sort(int arr[],int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    swap(arr, l, mid);

                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, h, mid);
                    h--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int firstTypeInd, int secondTypeInd) {
        int temp = arr[firstTypeInd];
        arr[secondTypeInd] = arr[firstTypeInd];
        arr[firstTypeInd] = temp;
    }
}
