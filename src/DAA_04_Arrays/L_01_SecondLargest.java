package DAA_04_Arrays;

public class L_01_SecondLargest {
    public static void main(String[] args) {
        //int [] numbers = {1,2,3,4,5,6,7,8,9};
        int [] numbers = {9,8,7,6,5,4,3,2,1};
        //int [] numbers = {1,3,9,5,4,7};
        //int [] numbers = {4,4,4,4,4,4};
        int max = numbers[0];
        int secondMax = -1;

        for (int numInd = 1; numInd < numbers.length; numInd ++) {
            if (numbers[numInd] > max) {
                if (secondMax < max) {
                    secondMax = max;
                }
                max = numbers[numInd];
            } else if (secondMax <= numbers[numInd]){
                secondMax = numbers[numInd];
            }
        }

        System.out.println(secondMax);
    }
}
