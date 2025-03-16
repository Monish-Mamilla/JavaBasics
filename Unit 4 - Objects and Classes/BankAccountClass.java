/**********************************
* Author: Monish Mamilla
* Program: Password Checker
* Version 1.0
* Development Date(s): 2/19/25
***********************************/
package Practice_Assignments;

public class BankAccountClass {
	// Declaring instance variables
    User user;
    String accountType;
    double balance;

    public BankAccountClass(User user, String accountType, double balance) 
    {
        this.user = user;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public User getUser() 
    {
        return user;
    }

    public void setUser(User user) 
    {
        this.user = user;
    }
    // Getting the account type
    public String getAccountType() 
    {
        return accountType;
    }
    // Getting balance
    public double getBalance() 
    {
        return balance;
    }
    // If amount is greater than balance, then there is not enough money
    public void withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("Not enough money.");
        } 
        // If it is less, then subtract the balance and amount
        else 
        {
            balance -= amount;
            System.out.println("New balance after withdrawal: " + balance);
        }
    }
    // Add balance to the amount from a deposit
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
    }
    // If amount is greater than balance, then there isn't enough money to transfer
    public void transfer(BankAccountClass recipient, double amount) 
    {
        if (amount > balance)
        {
            System.out.println("Not enough money for transfer.");
        } 
        // If it is less, then subtract balance and amount
        else 
        {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("New balance after transfer: " + balance);
        }
    }
    // toString method to return account type
    public String toString() 
    {
        return user.toString() + ", Account Type: " + accountType;
    }
}

