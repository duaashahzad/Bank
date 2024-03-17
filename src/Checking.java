public class Checking extends Account
{
    //variables
    private int[] last10Checks = new int[10];

    //Constructors
    public Checking()
    {

    }

    public Checking(String name, long taxID, double balance)
    {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;
        //last10Checks =
        //setName(name);
    }

    //overriding example
   /* public void setName(String n)
    {
        name = n;
    } */

    //Methods

    //Adjusts the balance and lists as a check and a withdrawal

    public void writeCheck(int checkNum, double amount)
    {
        balance -= amount;
        addToCheckArray(last10Checks, checkNum);
        addToArray(last10WithDraws, amount);
    }

    //loop to add checkNum to the last10Checks array
    public void addToCheckArray(int[] array, int checkNum)
    {
        for(int i = array.length - 1; i >= 1; i -= 1)
        {
            array[i] = array[i-1];
        }

        array[0] = checkNum;
    }

    //prints the accounts check register and deposit record
    public void display()
    {
        for (int i = 0; i < last10Checks.length; i++)
        {
            System.out.println("Check Number: " + last10Checks[i] + ", ");
        }
        for(int i = 0; i < last10WithDraws.length; i++)
        {
            System.out.println("Amount Withdrawn: " + last10WithDraws[i] + ", ");
        }

        System.out.println("\nNumber of Deposits: " + numDeposits);

        for (int i = 0; i < last10Deposits.length; i++)
        {
            System.out.println("Deposit: " + last10Deposits[i] + ", ");
        }

        System.out.println("\n");
    }

}
