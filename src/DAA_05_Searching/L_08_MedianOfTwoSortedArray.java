package DAA_05_Searching;


public class L_08_MedianOfTwoSortedArray {
    public static void main (String[] args) {
/*
        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {5, 15, 25, 35, 45};
        // O/P:- 27.5
*/
/*

        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {10, 20, 30, 40, 50};
        // O/P:- 6.0
*/

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {1, 2, 3, 4, 5};
        // O/P:- 10.0


    }

    private static int calculateMedian(int[] arrLeft, int[] arrRight) {
        int arrLeftInd = 0;
        int arrRightInd = arrLeft.length;

        while (arrLeftInd <= arrRightInd) {
            int arrLeftMid = (arrLeftInd + arrRightInd) / 2;
            int arrRightMid = ((arrLeft.length + arrRight.length + 1) / 2 ) - arrLeftMid;
            
        }
        return 0;
    }


}
