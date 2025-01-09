public class L_02_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 1, 3, 3, 3};
        int b[] = {1, 1, 1, 1, 3, 5, 7};

        printIntersectionOfTwoArr(a, b);

    }

    private static void printIntersectionOfTwoArr(int[] a, int[] b) {
        int i = 0, j = 0, previousVal = Integer.MIN_VALUE;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (previousVal != a[i]) {
                    System.out.println(a[i]);
                }
                previousVal = a[i];
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    /*
        a[] = {3, 5, 10, 10, 10, 15, 15, 20}
        b[] = {5, 10, 10, 15, 30}
        O/P:- {5, 10, 15}


        int a[] = {1, 1, 3, 3, 3};
        int b[] = {1, 1, 1, 1, 3, 5, 7};
        O/P:- {1, 3}
     */
}
