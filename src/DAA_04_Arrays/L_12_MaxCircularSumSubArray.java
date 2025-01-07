package DAA_04_Arrays;

public class L_12_MaxCircularSumSubArray {
    public static void main(String[] args) {
        //int[] arr = {5, -2, 3, 4}; // O/P:- 12
        int[] arr = {8, -4, 3, -5, 4};
        System.out.println(calculateMaxSubArraySum(arr));

    }

    private static int calculateMaxSubArraySum(int[] arr) {
        int normalSum = normalSum(arr);
        int totalArraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalArraySum = totalArraySum + arr[i];
            arr[i] = -arr[i];
        }

        int maxSubArraySumAfterSignChange = normalSum(arr);
        return Math.max(normalSum, totalArraySum+maxSubArraySumAfterSignChange);
    }
    private static int normalSum(int[] arr) {
        int finalRes = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = Math.max(arr[i], arr[i] + res);
            finalRes = Math.max(res, finalRes);
        }

        return finalRes;
    }

}




















