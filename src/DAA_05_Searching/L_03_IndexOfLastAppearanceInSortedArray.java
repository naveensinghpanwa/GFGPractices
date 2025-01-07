package DAA_05_Searching;

public class L_03_IndexOfLastAppearanceInSortedArray {
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

           if (pos > -1 && ((pos == intNums.length - 1 && intNums[intNums.length - 1 ] == num) || (intNums[pos] == num && intNums[pos+1] != num))) {

               break;
           }

           if (intNums[mid] <= num) {
               left = mid;
           } else {
               right = mid;
           }
        }

        System.out.println(pos);
    }
}
