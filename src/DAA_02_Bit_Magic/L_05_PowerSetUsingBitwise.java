package DAA_02_Bit_Magic;

public class L_05_PowerSetUsingBitwise {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        L_05_PowerSetUsingBitwise l_05_powerSetUsingBitwise = new L_05_PowerSetUsingBitwise();
        l_05_powerSetUsingBitwise.printPowerSet(chars);
    }

    private void printPowerSet(char[] chars) {
        int charsLen = chars.length;
        int possibleCombLen = (int) Math.pow(2, charsLen);

        for (int possibleComLenInd = 0; possibleComLenInd < possibleCombLen; possibleComLenInd++) {
            int tNum = possibleComLenInd;
            for (int charLenInd = 0; charLenInd < charsLen; charLenInd++) {
                if ((tNum & 1) == 1) {
                    System.out.print(chars[charLenInd]);
                }
                tNum = tNum >> 1;
            }
            System.out.println();
        }

        //System.out.println(possibleCombLen);
    }
}

/*

*/