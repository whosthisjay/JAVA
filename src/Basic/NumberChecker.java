package Basic;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            System.out.println(input + " is an integer.");
        } else if (isFloat(input)) {
            System.out.println(input + " is a float.");
        } else {
            System.out.println(input + " is neither an integer nor a float.");
        }
    }

    public static boolean isInteger(String str) {
        return str.matches("^-?\\d+$");
    }

    public static boolean isFloat(String str) {
        return str.matches("^-?\\d*\\.\\d+$");
    }
}
