package DAA_05_Searching;

public class L_01_BST {
    public static void main (String[] args) {
        int[] intNums = {1, 3, 5, 6, 8, 9};
        int num = 3;

        int left = 0;
        int right = intNums.length-1;
        int pos = -1;
        while (left <= right) {
            if (num == intNums[left]) {
                pos = left;
                break;
            } else if (num == intNums[right]) {
                pos = right;
                break;
            } else if (num == intNums[(int) Math.floor((left + right))/2]) {
                pos = (int) Math.floor((left + right))/2;
                break;
            } else if (num < intNums[(int) Math.floor((left + right))/2]) {
                left++;
                right = (int) Math.floor((left + right))/2;
                right--;
            }
        }

        System.out.println(pos);
    }
}
