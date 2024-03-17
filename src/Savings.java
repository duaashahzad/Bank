public class Savings extends Account
{
    //Constructor
    public Savings()
    {

    }

    public Savings(String name, long taxID, double balance)
    {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;
    }

    //Methods

    //adjusts the balance and lists as a withdrawal
    public void doWithdraw(double amount)
    {
        balance -= amount;
        addToArray(last10WithDraws, amount);
        numWithdraws++;
    }

    //prints the account's withdrawal and deposit record
    public void display()
    {
        System.out.println("Number of Withdraws: " + numWithdraws);

        for (int i = 0; i < last10WithDraws.length; i++)
        {
            System.out.println("Amount Withdrawn: " + last10WithDraws[i] + ", ");
        }

        System.out.println("\n");

        for (int i = 0; i < last10Deposits.length; i++)
        {
            System.out.println("Deposit: " + last10Deposits[i] + ", ");
        }

        System.out.println("\n");
    }
}
