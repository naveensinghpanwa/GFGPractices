package DAA_05_Searching;

public class L_04_SquareRootUsingBinarySearch {
    public static void main (String[] args) {
        int num = 5;

        System.out.println(squareRootUsingBS(num));
    }

    private static int squareRootUsingBS (int num) {
        int left = 0;
        int right = num;

        while(left <= right) {
            int mid = (left + right ) / 2;
            if (mid * mid > num) {
                right = mid;
            } else if (mid * mid < num) {
                left = mid;
            } else {
                return mid;
            }

            if (mid * mid >= num && (mid - 1) * (mid - 1) < num) {
                return mid-1;
            }
        }

        return left;
    }
}
