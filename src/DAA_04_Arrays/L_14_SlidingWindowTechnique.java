package DAA_04_Arrays;

public class L_14_SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] intArray = {1, 8, 30, -5, 20, 7}; // O/P:- 53
        int windowSize = 4;
        int maxSum = 0;

        for (int i = 0; i < windowSize; i++) {
            maxSum = maxSum + intArray[i];
        }

        for (int intArrayInd = windowSize; intArrayInd < intArray.length; intArrayInd++) {
            int newCount = maxSum - intArray[intArrayInd-windowSize] + intArray[intArrayInd];
            maxSum = Math.max(newCount, maxSum);
        }

        System.out.println(maxSum);
    }
}




















