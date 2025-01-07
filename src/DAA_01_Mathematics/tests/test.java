package DAA_01_Mathematics.tests;

public class test {
    public static void main(String[] args) {
        //int num = inputSampleForSQRRoot();

        //System.out.println(findNearestSQRRoot(num));
        int num = 13/2;
        System.out.println(" --> " + num);
    }

    private static int findNearestSQRRoot (int num) {
        int l = 1;
        int r = num;

        while (l <= r) {
            int m = (l + r) / 2;

            if (m * m == num) {
                return m;
            }

            if ((m-1) * (m-1) < num && m * m > num) {
                return m - 1;
            }

            if (m * m > num) {
                r = m;
            } else {
                l = m;
            }

        }

        return -1;
    }

    private static int[] getInputSamplesForSearchInRotatedArray() {
        int[] inp1 = {10, 20, 30, 40, 50, 8, 9};            // nts:- 30     o/p:-  2
        int[] inp2 = {100, 200, 300, 10, 20};               // nts:- 40     o/p:-  -1
        return inp1;
    }

    private static int inputSampleForSQRRoot() {
        int x1 = 4;   // O/P:- 2
        int x2 = 25;   // O/P:- 5
        int x3 = 14;   // O/P:- 3
        return x1;
    }
}