public class BankAccount
{
    private int accountNumber;
    private int accountBalance;
    public BankAccount(int accNum, int accBal)
    {
        this.accountNumber = accNum;
        this.accountBalance = accBal;
        System.out.println("You bank account with account number: "+this.accountNumber+" has been created");
    }
    public void deposit(int amount)
    {
        if(amount<0)
            System.out.println("Amount cannot be less than 0");
        else
        {
            accountBalance = accountBalance+amount;
            System.out.println("Your account "+accountNumber+" has been deposted with an amount of "+amount);
        }
    }
    public void withdrawal(int amount)
    {
        if(amount>accountBalance)
            System.out.println("Requested funds not available");
        else {
            accountBalance = accountBalance - amount;
            System.out.println("An amount of Rs."+amount+" has been withdrawn from you bank account.");
        }
    }
    public void fetchBalance()
    {
        System.out.println("Available Balance: "+accountBalance);
    }
    public static void main(String[]args)
    {
        BankAccount account = new BankAccount(1109, 10000);
        account.fetchBalance();
        account.deposit(1000);
        account.fetchBalance();
        account.withdrawal(5000);
        account.fetchBalance();
    }
}
