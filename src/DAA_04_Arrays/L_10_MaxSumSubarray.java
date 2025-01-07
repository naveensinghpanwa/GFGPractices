package DAA_04_Arrays;

public class L_10_MaxSumSubarray {
    public static void main(String[] args) {
        //int arr[] = {2,3,-8,4,-1,2,3};  // O/P:- 11
        //int arr[] = {1,-2,3,-1,2};
        int arr[] = {1,5,3,8,12};
        int sum = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = res + arr[i];

            if (res < arr[i]) {
                res = arr[i];
            }

            if (res > sum) {
                sum = res;
            }
        }

        System.out.println(sum);

    }
}




















