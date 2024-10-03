package Assesment2;

import java.util.Scanner;

public class CheckInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            System.out.println(input + " is a valid integer.");
        } else {
            System.out.println(input + " is not a valid integer.");
        }

    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
