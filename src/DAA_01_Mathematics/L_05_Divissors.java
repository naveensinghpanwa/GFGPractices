package DAA_01_Mathematics;

public class L_05_Divissors {


    public static void main(String[] args) {
        int num = 25;
        int divisorBeforeSqrtHit = 1;

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                divisorBeforeSqrtHit = i;
            }
        }

        for (int i = divisorBeforeSqrtHit; i > 0; i--) {
            if (num % i == 0 && divisorBeforeSqrtHit != (num/i)) {
                System.out.print(num/i + " ");
            }
        }
    }
}