# PBO 5A - Self Exercise / Exploration of Array and ArrayList

## Description

This program was created to fulfill the **5A - Self Exercise/Exploration of Array and ArrayList** assignment for the Object-Oriented Programming (PBO) course.

The program is a simple banking system simulation that applies Object-Oriented Programming concepts, particularly the use of **Arrays**, objects, constructors, methods, and accessors.

The program also comes with a simple menu using `Scanner` to perform several operations on a bank account.

## Program Structure

The program consists of several classes:

- `account.java`
  Stores balance information and provides methods for deposit, withdraw, and checking the balance.

- `customer.java`
  Stores customer information such as first name, last name, and the account owned.

- `bank.java`
  Stores customers in an array and provides methods for adding and retrieving customers.

- `tugas3.java`
  The main program used to create objects and explore the use of classes, arrays, and methods.

## Program Features

When the program starts, the user is asked to enter a first name and last name to create a new customer. That customer is automatically given an initial balance of `50000`.

Once the account is created, the program displays the main menu with the following options:

1. Deposit
2. Withdraw
3. Check Balance
4. Exit

## Screenshots

### 1. Customer Name Input

Screenshot of the program asking for the customer's first and last name.

![Name Input](name.png)

### 2. Main Menu

Screenshot of the main menu being displayed.

![Main Menu](menu.png)

### 3. Deposit

Screenshot of selecting the **Deposit** menu and entering an amount.

![Deposit](depo.png)

### 4. Withdraw

Screenshot of selecting the **Withdraw** menu and entering an amount.

![Withdraw](withdraw.png)

### 5. Check Balance and Exit

Screenshot of selecting **Check Balance** and selecting **Exit**.

![Check Balance](check.png)

![Exit](exit.png)

## How to Run

Make sure Java is installed on your computer.

Compile all Java files:

```bash
javac *.java
```

Run the program through the main class (`Main`):

```bash
java Main
```