/**********************************
* Author: Monish Mamilla
* Program: Password Checker
* Version 1.0
* Development Date(s): 2/19/25
***********************************/
package Practice_Assignments;
public class BankAccountTester {
    public static void main(String[] args) {
    	// Initializing the first name, last name, and email address
        User user1 = new User(101, "James", "Charles", "charles@ejames.com");
        User user2 = new User(102, "John", "Cena", "cena@wwe.com");
        // Account type and money for users 
        BankAccountClass account1 = new BankAccountClass(user1, "Checking", 500.0);
        BankAccountClass account2 = new BankAccountClass(user2, "Savings", 1000.0);
        System.out.println(account1);
        System.out.println(account2);
        // Balance of each account
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
        // Withdrawing 200 dollars and depositing 300 dollars. 
        account1.withdraw(200);
        account1.deposit(300);
        // Transferring 400 dollars. 
        account1.transfer(account2, 400);
    }
}

