package Java;
 import java.util.Scanner;
class BankAccount
{
    private double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        if(amount <=0)
        {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("Amount of ₹ "+ "\"" + amount + "\""+ " Deposited Successfully");
    }
    public void withdraw(double amount)
    {
        if (amount <= 0) {
            System.out.println("\nInvalid amount for withdrawal");
            return;
        }
        if (amount > balance) {
            System.out.println("\nInsufficient balance in your account, so you can't withdrawal your money");
            return;
        }
        balance -= amount;
        System.out.println("Amount of ₹ " + "\"" + amount + "\"" + " withdrawn successfully");
    }
    
    public void checkBalance()
    {
        System.out.println("Balance in your account is " + balance + "₹");
    }
}

class Atm
{
    private BankAccount ac = new BankAccount(0);
    Scanner sc = new Scanner(System.in);

    public void Menu()
    {
        while (true)
        {
            System.out.println("\nWelcome to the ATM \nPlease select any one from above menu.");
            System.out.println("1. Deposit");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            
            System.out.print("\nEnter your choice: ");
            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    ac.deposit(amount);
                    break;
                case 2:
                    ac.checkBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    ac.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("You input Invalid choice.\nPlease insert valid number");
                    break;
            }
        }
    }
}

public class Atm_Interface
{
    public static void main(String[] args) 
    {
        Atm a = new Atm();
        a.Menu();  
    }
}


