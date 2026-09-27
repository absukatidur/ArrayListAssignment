import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Create Your Account ===");
        System.out.print("First name: ");
        String f = input.nextLine().trim();
        System.out.print("Last name: ");
        String l = input.nextLine().trim();

        Bank bank = new Bank();
        bank.addCustomer(f, l);
        Customer customer = bank.getCustomer(0);

        double initBalance = readDouble(input, "Initial deposit: ");
        customer.setAccount(new Account(initBalance));
        Account account = customer.getAccount(0);

        System.out.println("\nAccount created for " + customer.getFirstName()
                + " " + customer.getLastName() + " with balance " + account.getBalance());

        int choice;
        do {
            printMenu();
            choice = readInt(input, "Choose an option: ");

            switch (choice) {
                case 1:
                    double depositAmount = readDouble(input, "Deposit amount: ");
                    boolean depositOk = account.deposit(depositAmount);
                    System.out.println(depositOk
                            ? "Deposit successful. New balance: " + account.getBalance()
                            : "Deposit failed (amount must be positive).");
                    break;
                case 2:
                    double withdrawAmount = readDouble(input, "Withdraw amount: ");
                    boolean withdrawOk = account.withdraw(withdrawAmount);
                    System.out.println(withdrawOk
                            ? "Withdraw successful. New balance: " + account.getBalance()
                            : "Withdraw failed (insufficient balance).");
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 0:
                    System.out.println("Goodbye, " + customer.getFirstName() + "!");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
            System.out.println();

        } while (choice != 0);

        input.close();
    }

    private static void printMenu() {
        System.out.println("=========================");
        System.out.println("       ATM MENU          ");
        System.out.println("=========================");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("0. Exit");
    }

    private static int readInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = input.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    private static double readDouble(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = input.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}