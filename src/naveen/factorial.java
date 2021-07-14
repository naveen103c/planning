package naveen;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Enter Valid Number");
        } else {
            int fact = factorial(number);
            System.out.println(fact);
        }

    }

    private static int factorial(int number) {
        if (number < 1) {
            return 0;
        }
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
