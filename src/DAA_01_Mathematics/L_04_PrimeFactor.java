package DAA_01_Mathematics;

public class L_04_PrimeFactor {


    public static void main(String[] args) {
        int num = 300;
        L_04_PrimeFactor l_03_checkForPrime = new L_04_PrimeFactor();

        l_03_checkForPrime.printPrimeFactors(num);
    }

    public void printPrimeFactors(int num) {
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num = num / 2;
        }

        while (num % 3 == 0) {
            System.out.print(3 + " ");
            num = num / 3;
        }

        for (int i = 5; i * i <= num; i = i + 6) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }

            while (num % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                num = num / (i + 2);
            }
        }

        if (num > 3) {
            System.out.print(num);
        }
    }
}
