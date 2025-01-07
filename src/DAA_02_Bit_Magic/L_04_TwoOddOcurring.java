package DAA_02_Bit_Magic;

public class L_04_TwoOddOcurring {
    public static void main(String[] args) {
        int [] nums = {1, 2, 2, 7, 5, 3, 3, 9, 6, 9, 6, 1, 7, 7};
        int result = 0, res1 = 0, res2 = 0;
        for (int num : nums) {
            result = result ^ num;
        }

        int sn = result & (-result);
        System.out.println(result);
        System.out.println(sn);

        for (int num : nums) {
            if ((num & sn) != 0) {
                res1 = res1 ^ num;

            } else {
                res2 = res2 ^ num;
            }
        }

        System.out.println(res1 + " = " + res2);
    }
}

/*
    011
    101
    010
*/