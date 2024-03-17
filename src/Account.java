/* Name: Duaa Shahzad
# Date: 2/13/2022
# Class: CSC 1120-02
# Pledge: I have neither given nor received unauthorized aid on this
program.
# Description: The Bank Account Class allows for updates and
modification to the child classes.
# Input: The user types commands of numbers from #1-10 and the amount according the functions of the command
# Output:The program will compute the command and display the rolling balance of each of the
classes.
*/

public class Account
{
    //variables
    protected String name;
    protected long taxID;
    protected double balance;
    protected double[] last10WithDraws = new double[10];;
    protected double[] last10Deposits = new double[10] ;
    protected int numDeposits;
    protected int numWithdraws;

    //Constructors
    public Account()
    {

    }

    public Account(String name, long taxID, double balance)
    {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;
        //last10WithDraws = new double[10];
        //last10Deposits = new double[10];
        numDeposits = 0;
        numWithdraws = 0;
    }

    //methods
    public void setName(String n)
    {
       name = n;
    }

    public void setTaxID(long id)
    {
       taxID = id;
    }

    public void setBalance(double b)
    {
        balance = b;
    }

    public String getName()
    {
        return name;
    }

    public long getTaxID()
    {
        return taxID;
    }

    public double getBalance()
    {


        return balance;
    }

    //makes a deposit and also adds the amount of the deposit to the last10deposits array
    //checks that the amount is within range of 0-100000
    public void makeDeposit(double amount)
    {
        if(amount >= 0 && amount <= 100000) {
            balance += amount;
            addToArray(last10Deposits, amount);
            numDeposits++;
        }
        else
        {
            System.out.println("Please enter deposit amount between 0 and 100000: ");
        }

    }

    //can call in other classes with instant variable method takes an array and amount as a parameter is
    //able to add elements to the array
    public void addToArray(double[] array, double amount)
    {
        for(int i = array.length - 1; i >= 1; i -= 1)
        {
            array[i] = array[i-1];
        }

        array[0] = amount;
    }

    //prints name, taxID, and balance to use when the method is called
    public void display()
    {
        System.out.println("Name of client: " + name);
        System.out.println("Social Security Number: " + taxID);
        System.out.println("Balance: $" + balance + "\n");
    }
}
