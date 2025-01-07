package DAA_01_Mathematics;

public class L_02_GDP {


    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 20;

        while (num1 > 0) {
          if (num2 > num1) {
              num2 = num1 + num2;
              num1 = num2 - num1;
              num2 = num2 - num1;
          } else {
              num1 = num1 - num2;
          }
        }

        System.out.println(num2);

    }
}
/*

10, 20

20, 10
10, 10

print num2
 */