package DAA_05_Searching;

public class L_05_SearchInSortedRotatedArray {
    public static void main (String[] args) {
        int[] intArray = {100, 500, 700, 10, 20, 30, 40, 50};
        //int[] intArray = {10, 20, 40, 60, 5, 8};
        int num = 500;

        System.out.println(applyCircularBinarySearch(intArray, num));
    }

    public static int applyCircularBinarySearch (int[] intArray, int num) {
        int pos = -1;
        int left = 0;
        int right = intArray.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (intArray[mid] == num) {
                return mid;
            }

            if (intArray[mid] <= intArray[left]) {
                if (num >= intArray[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (num >= intArray[mid]) {
                    left = mid + 1;
                } else {
                    if (intArray[right] <= intArray[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }

                }
            }
        }

        return pos;
    }
}
