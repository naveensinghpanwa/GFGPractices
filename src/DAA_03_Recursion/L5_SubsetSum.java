package DAA_03_Recursion;

public class L5_SubsetSum {
    public static void main(String[] args) {
        L5_SubsetSum l3_toh = new L5_SubsetSum();
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 6;
        System.out.println(l3_toh.subsetSum(arr, 6, arr.length));

    }

    private int subsetSum(int[] arr, int currSum, int len) {
        if (len == 0) {
            return currSum == 0 ? 1 : 0;
        }

        return subsetSum(arr, currSum, len - 1) + subsetSum(arr,currSum - arr[len-1],  len - 1);
    }
}
