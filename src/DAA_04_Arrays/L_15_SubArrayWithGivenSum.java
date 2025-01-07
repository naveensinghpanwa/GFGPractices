package DAA_04_Arrays;

public class L_15_SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        System.out.println(subArrayWithGivenSum(intArray, sum));
    }

    private static String subArrayWithGivenSum(int[] intArray, int sum) {
        int previousInd = 0;
        int currentInd = 1;
        int tempSum = intArray[0];

        while (previousInd != intArray.length && currentInd != intArray.length) {
            if (tempSum == sum) {
                return "Yes";
            }

            tempSum = tempSum + intArray[currentInd];

            if (tempSum < sum) {
                currentInd++;
            } else {
                tempSum = tempSum - intArray[previousInd];
                previousInd++;
            }

        }

        return "No";
    }
}




















