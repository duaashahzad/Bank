public class CreditCard extends Account
{
    //variables
    long cardNumber;
    String[] last10Charges = new String[10]; ;

    //Constructors
    public CreditCard()
    {

    }

    public CreditCard(String name, long taxID, double balance)
    {
        this.name = name;
        this.taxID = taxID;
        this.balance = balance;
        //last10Charges = new String[10];
    }

    //Methods

    //adjusts the balance and lists as a withdrawal
    public void debitCharge(String name, double amount)
    {
        balance += amount;
       addToArray(last10WithDraws, amount);
       addToChargeArray(last10Charges, name);
    }

    //adjusts the balance and lists as a deposit
    public void makePayment(double amount)
    {
        balance -= amount;
        addToArray(last10Deposits, amount);
    }

    //loop to add name to the last10Charges array
    public void addToChargeArray(String[] array, String name)
    {
        for(int i = array.length - 1; i >= 1; i -= 1)
        {
            array[i] = array[i-1];
        }

        array[0] = name;
    }

    //prints the account's charges and deposit record
    public void display()
    {
        for (int i = 0; i < last10Charges.length; i++)
        {
            System.out.println("Name of Charge: " + last10Charges[i] + ", ");
        }

        for (int i = 0; i < last10WithDraws.length; i++)
        {
            System.out.println("Amount: " + last10WithDraws[i] + ", ");
        }

        System.out.println("\n");

        for (int i = 0; i < last10Deposits.length; i++)
        {
            System.out.println("Deposits: " + last10Deposits[i] + ", ");
        }

        System.out.println("\n");
    }
}
