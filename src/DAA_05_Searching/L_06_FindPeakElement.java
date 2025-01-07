package DAA_05_Searching;

public class L_06_FindPeakElement {
    public static void main (String[] args) {
        int[] intArray = {5, 20, 40, 30, 20, 50, 60};

        System.out.println(findPeakElement(intArray));
    }

    public static int findPeakElement (int[] intArray) {
        int left = 0;
        int right = intArray.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if ((mid == 0 || intArray[mid-1] <= intArray[mid]) && (mid == intArray.length - 1 || intArray[mid + 1] <= intArray[mid])) {
                return intArray[mid];
            }

            if (mid > 0 && intArray[mid] <= intArray[mid-1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
