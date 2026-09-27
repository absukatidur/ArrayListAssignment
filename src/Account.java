public class Account {
    private double balance;

    // Constructor: takes initial balance and populates the balance attribute
    public Account(double init_balance) {
        balance = init_balance;
    }

    // Retrieves the current balance
    public double getBalance() {
        return balance;
    }

    // Adds the amount parameter to the current balance
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    // Removes the amount parameter from the current balance
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}
