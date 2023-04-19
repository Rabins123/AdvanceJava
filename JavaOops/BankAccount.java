import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // constructor with parameters
    public BankAccount(int acc_no, double bal) {
        accountNumber = acc_no;
        balance = bal;
    }

    // Method to get account details
    public void getAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to deposit money into account
    public void Deposit(double amount) {
        balance = balance + amount;
        System.out.println("$ " + amount + "deposited successfully");
    }

    // Method to withdraw money
    public void Withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("$" + amount + "withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

}

class BankAccountTest{
    public static void main(String [] args){
         Scanner sc =new Scanner(System.in);

         //Creating object using constructor
         BankAccount account=new BankAccount(101, 100.0);

         //Accessing objects
         account.getAccountDetails();

         //depositing
         System.out.println("Enter amount to deposit: ");
         double amount1=sc.nextDouble();
         account.Deposit(amount1);
         sc.close();

         ////depositing
         System.out.println("Enter amount to withdraw: ");
         double amount2=sc.nextDouble();
         account.Withdraw(amount2);
    
    }
}
