
/*
    A pair arr[i] and arr[j] forms an inversion when i < j and arr[i] > arr[j], it is similar to the
    merge method except when we are copying values from b to k then we have to calculate.

 */

public class L_04_InversionInArr {
    public static void main(String[] args) {
        int [] a = {2, 4, 1, 3, 5};
        System.out.println(countInv(a, 0, a.length-1));
        //int [] b = {10, 20, 40, 20, 30};
        //findInv(b, 0, 2, 4);
        //Arrays.stream(b).asLongStream().forEach(System.out::println);
    }

    private static int  countInv (int[] a, int l, int r) {
        int result = 0;

        if (l < r) {
            int m = l + (r - l) / 2;
            result = result + countInv(a, l, m);
            result = result + countInv(a, m + 1, r);
            result = result + findInv(a, l, m ,r);
        }

        return result;
    }

    private static int findInv(int[] a, int s, int m, int e) {
        int[] l = new int[m - s + 1];
        int[] r = new int[e - m];

        for (int i = 0; i < l.length; i++) {
            l[i] = a[s + i];
        }

        for (int j = 0; j < r.length; j++) {
            r[j] = a[m + 1 + j];
        }

        int i = 0, j = 0, k = s, result = 0;
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                result = result + l.length - i; // only this is the difference compared to merge sort
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

        return  result;
    }
}

/*
    int [] a = {2, 4, 1, 3, 5};
    O/P:- 3

    int [] a = {10, 20 30, 40};
    O/P:- 0

    int [] a = {40, 30, 20, 10};
    O/P:- 6
 */
