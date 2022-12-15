import java.util.*;

class WhileLoop {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 positive numbers(1st < 2nd)");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        if (firstNum < secondNum) {

            // for even
            for (int i = firstNum; i < secondNum; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                    sumEven = sumEven + i;
                }
            }
            System.out.println("\n\n Sum of even numbers from is :" + sumEven + "\n\n");

            // for odd
            for (int i = firstNum; i < secondNum; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                    sumOdd = sumOdd + i;
                }
            }
            System.out.println("\n\n Sum of even numbers from is :" + sumOdd + "\n\n");
        }

    }
}
