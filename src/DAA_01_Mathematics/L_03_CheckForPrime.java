package DAA_01_Mathematics;

public class L_03_CheckForPrime {


    public static void main(String[] args) {
        int num = 1;
        L_03_CheckForPrime l_03_checkForPrime = new L_03_CheckForPrime();
        //l_03_checkForPrime.isPrime(num);
        System.out.println(l_03_checkForPrime.isPrime(num));
    }

    public boolean isPrime(int num) {

        if (num == 2 || num ==3) {
            return true;
        }

        if (num == 1 || num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(num); i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
