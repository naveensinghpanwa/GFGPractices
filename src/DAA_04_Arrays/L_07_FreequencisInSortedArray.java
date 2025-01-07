package DAA_04_Arrays;

public class L_07_FreequencisInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1, 2,3,4,5,6,7,8, 8,10, 10,11, 11};
        //int arr[] = {8, 8, 8, 8, 8, 8, 8};
        int count = 1;
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                if (i == 0) {
                    count++;
                }
                count++;
            } else {
                System.out.println(arr[i-1] + " : " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length-1] + " : " + count);
    }
}




















