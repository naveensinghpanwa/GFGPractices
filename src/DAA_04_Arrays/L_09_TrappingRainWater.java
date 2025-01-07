package DAA_04_Arrays;

public class L_09_TrappingRainWater {
    public static void main(String[] args) {
        //int arr[] = {1,5,3,8,12};
        //int arr[] = {3,0,1,2,5, 1, 3, 5,1};  // o/p = 6
        //int arr[] = {2,0,2}; //o/p = 2
        int arr[] = {3,2,1};
        //int arr[] = {5,0,6,2,3};
        int first = 0;

        int last = arr.length - 1;
        int rainCap = 0;
        int sizeDiff = 0;
        for (int i = 0; i < arr.length; i++) {


            if (arr[first] - arr[i] > 0) {
                rainCap = rainCap + Math.abs(arr[first] - arr[i]);
            } else {
                    first = i;
            }

            if (i == arr.length - 1 && arr[first] - arr[last] > 0) {
                sizeDiff = (arr[last] - arr[first]) * (last - first);

                if (sizeDiff < 0) {
                    rainCap = rainCap - Math.abs(sizeDiff);
                }
            }
        }

        rainCap = Math.max(rainCap, 0);

        System.out.println(rainCap);
    }
}




















