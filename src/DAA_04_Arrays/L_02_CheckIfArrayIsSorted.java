package DAA_04_Arrays;

import java.util.Arrays;

public class L_02_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        //int [] numbers = {1,2,3,4,5,6,7,8,9};
        int [] numbers = {9,8,7,6,5,4,3,2,1};
        //int [] numbers = {1,3,9,5,4,7};
        //int [] numbers = {4,4,4,4,4,4};

        L_02_CheckIfArrayIsSorted l_02_checkIfArrayIsSorted = new L_02_CheckIfArrayIsSorted();
        System.out.println(l_02_checkIfArrayIsSorted.isArraySorted(numbers));

    }

    private boolean isArraySorted(int[] numbers) {
        for (int numInd = 1; numInd < numbers.length; numInd++) {
            if (numbers[numInd - 1] - numbers[numInd] > 0) {
                return false;
            }
        }

        return true;
    }
}
