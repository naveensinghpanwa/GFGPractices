package DAA_06_Sorting;

public class L_03_UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int [] a = {2, 3, 3, 3, 4, 4};
        int [] b = {4, 4};

        unionOfTwoArr(a, b);
    }

    private static void unionOfTwoArr(int[] a, int[] b) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (i > 0 && a[i-1] == a[i]) {
                i++;
                continue;
            }

            if (j > 0 && b[j-1] == b[j]) {
                j++;
                continue;
            }

            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else {
                System.out.println(b[j]);
                j++;
            }
        }

        while (i < a.length) {
            if (i > 0 && a[i-1] != a[i]) {
                System.out.println(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (j > 0 && b[j-1] != b[j]) {
                System.out.println(b[j]);
            }
            j++;
        }
    }
}

/*
    int [] a = {3, 5, 8};
    int [] b = {2, 8, 9, 10, 15};
    O/P:- 2, 3, 5, 8, 9, 10, 15

    int [] a = {2, 3, 3, 3, 4, 4};
    int [] b = {4, 4};
    O/P:- 2, 3, 4

 */
