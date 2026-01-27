import java.util.Scanner;

class BankAccount 
{
    String accountId;
    String accountHolderName;
    double balance;

   
    void assignValues(String id, String name, double bal) 
    {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() 
    {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

   
   static void searchAccount(BankAccount[] accounts, String searchId) 
    {
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) 
        {
            if (accounts[i].accountId.equals(searchId)) 
            {
                System.out.println("\nAccount Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (found!=true) 
        {
            System.out.println("\nAccount not found.");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

  
        accounts[0] = new BankAccount();
        accounts[0].assignValues("01", "abc", 1000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("02", "pqr", 800);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("03", "wer", 1200);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("04", "dfg", 9000);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("05", "ghb", 15000);

     System.out.println("All Bank Accounts:\n");
        for (int i = 0; i < accounts.length; i++) 
        {
            accounts[i].displayValues();
            System.out.println();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        searchAccount(accounts, searchId);

        sc.close();
    }
}
