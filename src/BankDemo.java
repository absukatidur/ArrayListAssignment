public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Joko", "Widodo");
        bank.addCustomer("Susi", "Susanti");
        bank.addCustomer("Budi", "Santoso");

        System.out.println("Number of customers: " + bank.getNumOfCustomers());
        System.out.println("Expected: 3");

        // Give the first customer an account and do some transactions
        Customer c0 = bank.getCustomer(0);
        Account acc = new Account(100000);
        acc.deposit(50000);
        acc.withdraw(20000);
        c0.setAccount(acc);

        System.out.println("\nCustomer 0: " + c0.getFirstName() + " " + c0.getLastName());
        System.out.println("Number of accounts for customer 0: " + c0.getNumOfAccounts());
        System.out.println("Balance of account 0: " + c0.getAccount(0).getBalance());
        System.out.println("Expected balance: 130000.0");

        // Show all customers
        System.out.println("\nAll customers:");
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);
            System.out.println((i + 1) + ". " + c.getFirstName() + " " + c.getLastName());
        }
    }
}
