package Exception.Practical4;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amount;

        Bank b1 = new Bank();
        Bank b2 = new Bank();
        Bank b3 = new Bank();

        b1.setCurrentBalance(678);
        b2.setCurrentBalance(1000);
        b3.setCurrentBalance(500);

        while (true) {
            clearConsole();
            System.out.println("\nSelect Account:");
            System.out.println("1: Account 1");
            System.out.println("2: Account 2");
            System.out.println("3: Account 3");
            System.out.println("0: Exit");
            int accountChoice = sc.nextInt();

            if (accountChoice == 0) {
                break;
            }

            Bank selectedBank;
            switch (accountChoice) {
                case 1:
                    selectedBank = b1;
                    break;
                case 2:
                    selectedBank = b2;
                    break;
                case 3:
                    selectedBank = b3;
                    break;
                default:
                    System.out.println("Invalid account selection. Try again.");
                    continue;
            }

            while (true) {
                clearConsole();
                System.out.println("1: Deposit Amount");
                System.out.println("2: Withdraw Amount");
                System.out.println("3: Check Balance");
                System.out.println("0: Back to Account Selection");
                int input = sc.nextInt();

                if (input == 0) {
                    break; // Exit the inner while loop and go back to account selection
                }

                try {
                    switch (input) {
                        case 1:
                            System.out.print("Enter Deposit Amount: ");
                            amount = sc.nextFloat();
                            selectedBank.setDepositAmount(amount);
                            break;
                        case 2:
                            System.out.print("Enter Withdraw Amount: ");
                            amount = sc.nextFloat();
                            selectedBank.setWithdrawAmount(amount);
                            break;
                        case 3:
                            selectedBank.getCurrentBalance();
                            break;
                        default:
                            System.out.println("Invalid option. Try again.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                sc.nextLine(); // Consume newline left-over
                System.out.println("Press Enter to continue...");
                sc.nextLine(); // Wait for the user to press Enter
            }
        }

        sc.close();
    }
}
