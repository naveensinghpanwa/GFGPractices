package DAA_01_Mathematics;

import java.util.Arrays;

public class L_06_Sieves {


    public static void main(String[] args) {
        int num = 25;
        boolean [] isPrime = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= num; j = i + j) {
                    isPrime[j] = false;
                }
            }
        }
    }
}


