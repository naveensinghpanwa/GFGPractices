package DAA_03_Recursion;

public class L4_JosephusProb {
    public static void main(String[] args) {
        L4_JosephusProb l3_toh = new L4_JosephusProb();
        System.out.println(l3_toh.josephusProb(5, 3));
    }

    private int josephusProb(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (josephusProb(n-1, k) + k) % n;
    }
}
