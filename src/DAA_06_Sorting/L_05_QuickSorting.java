package DAA_06_Sorting;

import java.util.Arrays;
import java.util.Random;

/**
    Lomuto Partition is used to find the pivot of a given array
 */
public class L_05_QuickSorting {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSortUsingLomuto(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("---------");
        //System.out.println(p);
    }

    private static void quickSortUsingLomuto(int[] arr, int l, int h) {
        if (l<h) {
            int selectRandomNum = new Random().nextInt(h-l)+l;
            swap(arr, selectRandomNum, h);
            int p = lPartition(arr, l, h);
            quickSortUsingLomuto(arr, l, p-1);
            quickSortUsingLomuto(arr, p + 1, h);
        }
    }

    private static int lPartition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h-1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tempVar = arr[i];
        arr[i] = arr[j];
        arr[j] = tempVar;
    }
}

/**
 int[] arr = {10, 80, 30, 90, 40, 50, 70};

 */