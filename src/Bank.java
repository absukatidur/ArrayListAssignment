public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    // Constructor: initializes the customers array with a max size > 5
    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    // Constructs a new Customer from (first name, last name),
    // places it in the customers array, and increments numberOfCustomers
    public void addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = new Customer(f, l);
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // Returns the customer associated with the given index
    public Customer getCustomer(int index) {
        return customers[index];
    }
}
