package Basic;
import java.util.Scanner;

public class IntegerOrFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        String input = sc.nextLine();

        if (isInteger(input)) {
            System.out.println(input + " is an integer.");
        } else if (isFloat(input)) {
            System.out.println(input + " is a float.");
        } else {
            System.out.println(input + " is neither an integer nor a float.");
        }
    }

    public static boolean isInteger(String input) {
        return input.matches("-?\\d+");
        //"-?\\d+": This regular expression matches an optional negative sign (-?),
        // followed by one or more digits (\\d+).
    }

    public static boolean isFloat(String input) {
        return input.matches("-?\\d*\\.\\d+");
        //"-?\\d*\\.\\d+": This regular expression matches an optional negative sign (-?),
        // followed by zero or more digits (\\d*),
        // a decimal point (\\.), and one or more digits (\\d+).
    }
}
