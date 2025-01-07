package DAA_01_Mathematics;

public class L_06_Iterative_Power {


    public static void main(String[] args) {
        int base = 2, exp = 10;
        int res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = res * base;
            }

            base = base * base;
            exp = exp / 2;
        }


        System.out.println(res);
    }
}


