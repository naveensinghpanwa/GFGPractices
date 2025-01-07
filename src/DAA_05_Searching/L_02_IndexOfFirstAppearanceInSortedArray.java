package DAA_05_Searching;

public class L_02_IndexOfFirstAppearanceInSortedArray {
    public static void main (String[] args) {
        int[] intNums = {1, 10, 10, 10, 20, 20, 40, 40, 40};
        int num = 40;

        int left = 0;
        int right = intNums.length-1;
        int pos = -1;
        while (left <= right) {
           int mid = (left + right) / 2;
           if (num == intNums[left]) {
               pos = left;
           } else if (num == intNums[mid]) {
               pos = mid;
           } else if (num == intNums[right]) {
               pos = right;
           }
           
           if (pos > -1 && ((pos == 0 || (intNums[pos-1] != num)) && intNums[pos] == num)) {
               break;
           } else if (num <= intNums[mid]) {
               right = mid - 1;
               left = left + 1;
           } else {
                left = mid + 1;
                right = right - 1;
           }
        }

        System.out.println(pos);
    }
}
