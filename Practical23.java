import java.util.Scanner;
class BankAccount 
{
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(Scanner sc) 
    {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.println("Account Opened Successfully!");
    }

  
    void deposit(Scanner sc)
   {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdraw(Scanner sc) 
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
        } 
	else 
	{
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() 
    {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount 
{
    double interestRate = 5;

    void calculateInterest() 
    {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest on Saving Account: " + interest);
    }
}


class FixedDepositAccount extends BankAccount 
{
    double interestRate = 7; 

    void maturityAmount(Scanner sc) 
    {
        System.out.print("Enter number of years for FD: ");
        int years = sc.nextInt();

        double maturity = balance + (balance * interestRate * years) / 100;
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}


public class Practical23
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Saving Account -----");
        SavingAccount sa = new SavingAccount();
        sa.openAccount(sc);
        sa.deposit(sc);
        sa.withdraw(sc);
        sa.checkBalance();
        sa.calculateInterest();

        sc.nextLine(); 

        System.out.println("\n----- Fixed Deposit Account -----");
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(sc);
        fd.deposit(sc);
        fd.checkBalance();
        fd.maturityAmount(sc);

        sc.close();
    }
}