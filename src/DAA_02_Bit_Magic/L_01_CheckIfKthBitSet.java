package DAA_02_Bit_Magic;

public class L_01_CheckIfKthBitSet {
    public static void main(String[] args) {
        int num = 5; // 101
        int k = 3;
        int a = num >> k;

        if ((a & 1) == 1) {
            System.out.println("Set");
        } else {
            System.out.println("Unset");
        }
    }
}
