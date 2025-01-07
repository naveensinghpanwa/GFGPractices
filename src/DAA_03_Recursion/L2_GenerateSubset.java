package DAA_03_Recursion;

/*

 */

public class L2_GenerateSubset {
    public static void main(String[] args) {
        L2_GenerateSubset l2_GenerateSubset = new L2_GenerateSubset();
        String str = "AB";
        l2_GenerateSubset.generateSubsets(str, "", 0);
    }

    private void generateSubsets(String str, String curr, int index) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }

        generateSubsets(str, curr, index + 1);
        generateSubsets(str, curr + str.charAt(index), index + 1);
    }
}
