package DAA_02_Bit_Magic;

public class L_03_OneOddOcurring {
    public static void main(String[] args) {
        int [] nums = {1, 2, 2, 7, 5, 3, 3, 9, 6, 9, 6, 1, 7};
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }

        System.out.println(result);
    }
}