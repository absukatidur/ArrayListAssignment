public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    // Constructor: takes first name and last name, populates attributes
    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Assigns (adds) an account to this customer
    public void setAccount(Account acct) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = acct;
        }
    }

    // Retrieves the account at the given index
    public Account getAccount(int account_index) {
        return accounts[account_index];
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}
