package DAA_03_Recursion;

public class L3_TOH {
    public static void main(String[] args) {
        L3_TOH l3_toh = new L3_TOH();
        l3_toh.TOH(3, 'A', 'B', 'C');
    }

    private void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }

        TOH(n-1, a, c, b);

        System.out.println("Move " + n + " from " + a + " to " + c);

        TOH(n-1, b, a, c);
    }
}
