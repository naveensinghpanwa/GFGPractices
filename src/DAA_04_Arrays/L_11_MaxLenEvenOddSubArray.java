package DAA_04_Arrays;

public class L_11_MaxLenEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 19, 13, 17, 12, 14, 15, 7, 9 , 11, 8}; // O/P:- 3
        boolean isPrevEleEven = isNumEven(arr[0]);
        int count = 1;
        int finalCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (isPrevEleEven && isNumEven(arr[i])) {
                count++;
            } else if (!isPrevEleEven && !isNumEven(arr[i])){
                count++;
            }
            if (isPrevEleEven == !isNumEven(arr[i])) {

                finalCount = Math.max(count, finalCount);
                count = 1;
                isPrevEleEven = isNumEven(arr[i]);
            }
        }

        System.out.println(finalCount);
    }

    private static boolean isNumEven(int num) {
        return num % 2 == 0;
    }
}




















