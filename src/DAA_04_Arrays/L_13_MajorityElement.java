package DAA_04_Arrays;

public class L_13_MajorityElement {
    public static void main(String[] args) {
        //int[] arr = {5, -2, 3, 4}; // O/P:- 12
        int[] arr = {8, 8, 6, 6, 6, 4, 6};
        int res = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                count = 1;
                res = i;
            }
        }

        int actualCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                actualCount++;
            }
        }

        if (actualCount < Math.floor(arr.length/2)+1) {
            res = -1;
        }

        System.out.println(res);
    }
}




















