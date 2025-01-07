package DAA_05_Searching;


/**
 * This program uses two pointer approach.
 */
public class L_07_TripletInSortedArray {
    public static void main (String[] args) {
        int[] intArray = {2, 5, 10, 15, 18};
        int sum = 33;
        int firstNum = -1;
        int left = -1;
        int right = -1;
        for (int intArrayInd = 0; intArrayInd < intArray.length; intArrayInd++) {
            firstNum = intArray[intArrayInd];
            int remainingSum = sum - firstNum;
            left = intArrayInd + 1;
            right = intArray.length - 1;

            while (left < right) {
                if (intArray[left] + intArray[right] < remainingSum) {
                    left++;
                } else if (intArray[left] + intArray[right] > remainingSum) {
                    right--;
                } else {
                    break;
                }
            }

            if (firstNum + intArray[left] + intArray[right] == sum) {
                break;
            }

        }
//        System.out.println(firstNum);

        System.out.println("Triplets are => " + firstNum + ", "
                + intArray[left] + ", "
                + intArray[right]);


    }
}
