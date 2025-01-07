package DAA_04_Arrays;

/*
I/P:- left = [1, 2, 5, 15], right = [5, 8, 7, 18]
O/P:- 5
*/

import java.util.Arrays;
import java.util.stream.IntStream;

public class L_17_MaximumAppearingElementInRanges {
    public static void main(String[] args) {
        int[] left = {1, 2, 5, 15};
        int[] right = {5, 8, 7, 18};
        int arraySize = findMax(IntStream.concat(Arrays.stream(left), Arrays.stream(right)));

        int[] frequencies = new int[arraySize+1];

        for (int i = 0; i < left.length; i++) {
            frequencies[left[i]] = 1;
            frequencies[right[i]] = -1;
        }

        int maxNum = 0;

        for (int i = 1; i < frequencies.length; i++) {
            frequencies[i] = frequencies[i - 1] + frequencies[i];
            if (frequencies[i] > frequencies[maxNum]) {
                maxNum = i;
            }
        }

        System.out.println(maxNum);

    }

    private static int findMax(IntStream combinedArray) {
        return combinedArray.max().orElse(0);
    }

}




















