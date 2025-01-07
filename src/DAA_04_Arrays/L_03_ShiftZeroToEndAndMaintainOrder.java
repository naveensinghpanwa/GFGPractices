package DAA_04_Arrays;

import java.util.Arrays;

public class L_03_ShiftZeroToEndAndMaintainOrder {
    /*
    public static void main(String[] args) {
        int [] numbers = {10, 8, 0,0, 12, 0};
        //int [] numbers = {0,0,0,0,1,2,3,4,5,6,7,8,9};
        //int [] numbers = {0,0,9,8,0,7,6,0,5,4,0,0,3,2,1};
        //int [] numbers = {1,3,9,5,4,7, 0, 0, 0, 0};
        //int [] numbers = {4,4,4,4,4,4};

        L_03_ShiftZeroToEndAndMaintainOrder l_03_shiftZeroToEndAndMaintainOrder = new L_03_ShiftZeroToEndAndMaintainOrder();
        System.out.println(Arrays.toString(l_03_shiftZeroToEndAndMaintainOrder.shiftZeroToEnd(numbers)));

    }

    private int[] shiftZeroToEnd(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers = swappedArray(numbers, i, count);
                count++;
            }
        }

        return numbers;
    }

/*    private static int[] shiftZeroToEnd(int[] numbers) {
        int ind2 = -1;
        for (int numInd = 0; numInd < numbers.length; numInd++) {
            if (numInd < numbers.length && ind2 < numbers.length) {
                if (numbers[numInd] == 0 && ind2 == -1) {
                    ind2 = numInd;
                } else if (numbers[numInd] == 0 && numbers[ind2] != 0) {
                    ind2 = numInd;
                } else if (ind2 > -1&& numbers[numInd] != 0 && numbers[ind2] == 0) {
                    numbers[ind2] = numbers[numInd];
                    numbers[numInd] = 0;
                    if (ind2 < numInd && numbers[ind2 + 1] == 0) {
                        ind2++;
                    }
                }
            }
        }
        return numbers;
    }*/
/*
    private static int[] swappedArray(int[] numbers, int ind1, int ind2) {
        int tempVar = numbers[ind2];
        numbers[ind1] = tempVar;
        numbers[ind2] = 0;
        return numbers;
    } */
    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

}


/*

{0,0,9,8,0,7,6,0,5,4,0,0,3,2,1}
{0,0,9,8,0,7,6,0,5,4,0,0,3,2,1}


for from 0 to n-1
    check


 */























