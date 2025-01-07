package DAA_03_Recursion;

/*
I/P:- n=5, a=2, b=5, c=1
O/P:- 5

I/P:- n=23, a=12, b=9, c=11
O/P:- 2
 */

import java.util.Arrays;

public class L1_Rope_Cutting_Problem {
    public static void main(String[] args) {
        L1_Rope_Cutting_Problem l1_rope_cutting_problem = new L1_Rope_Cutting_Problem();
        int count = l1_rope_cutting_problem.maxPiecesOfRope(7, 2, 2, 2);
        System.out.println(count);
    }

    private int maxPiecesOfRope(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return -1;
        }

        int result = Math.max(maxPiecesOfRope(n - a, a, b, c), Math.max(maxPiecesOfRope(n - b, a, b, c), maxPiecesOfRope(n - c, a, b, c)));

        if (result == -1) {
            return -1;
        }
        return result + 1;
    }


}
