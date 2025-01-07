package DAA_02_Bit_Magic;

public class L_02_IsPowerOfTwo {
    public static void main(String[] args) {
        int num = 5;
        L_02_IsPowerOfTwo l_02_isPowerOfTwo = new L_02_IsPowerOfTwo();
        System.out.println(l_02_isPowerOfTwo.isPowOfTwo(num));
    }

    public boolean isPowOfTwo(int num) {
        if (num == 0) {
            return false;
        }
        return (num & (num - 1)) == 0;
    }
}


/*

    4 = 100
    4 - 1 = 3 = 11

    100 & 011 = 0
 */