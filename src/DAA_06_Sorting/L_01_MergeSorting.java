package DAA_06_Sorting;

import java.util.Arrays;

public class L_01_MergeSorting {
    public static void main(String[] args) {
        int[] al = {10, 20, 40 ,20, 30};
        mergeSort(al, 0, al.length - 1);
        Arrays.stream(al).asLongStream().forEach(System.out::println);
    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;  // todo: important to prevent overflow
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            mergeProcedure(a, start, mid, end);
        }
    }
    private static void mergeProcedure(int []a, int start, int mid, int end) {
        int[] l = new int[mid - start + 1];
        int[] r = new int[end - mid];

        for (int i = 0; i < l.length; i++) {
            l[i] = a[i + start];
        }

        for (int j = 0; j < r.length; j++) {
            r[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < l.length && j < r.length){
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < l.length) {
            a[k] = l[i];
            k++;
            i++;
        }

        while (j < r.length) {
            a[k] = r[j];
            k++;
            j++;
        }
    }
}
