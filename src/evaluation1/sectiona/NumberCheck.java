package evaluation1.sectiona;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("The number is negative");
            } else if (input > 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is zero");
            }
            sc.close();

        }
    }
}

