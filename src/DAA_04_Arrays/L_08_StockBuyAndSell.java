package DAA_04_Arrays;

public class L_08_StockBuyAndSell {
    public static void main(String[] args) {
        //int arr[] = {1,5,3,8,12};
        int arr[] = {30,20,10};
        int profit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]) {
                profit = profit + arr[i+1] - arr[i];
            }
        }


        System.out.println(profit);
    }
}




















