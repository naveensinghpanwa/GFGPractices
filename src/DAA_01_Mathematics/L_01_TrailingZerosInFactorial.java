package DAA_01_Mathematics;

public class L_01_TrailingZerosInFactorial {


    public static void main(String[] args) {

        double num = 10;

        int count = 0;
        while (num > 0) {
            num = Math.floor(num/5);
            count++;
        }

        System.out.println(count);
    }
}
