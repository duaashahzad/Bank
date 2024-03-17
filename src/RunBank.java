import java.util.Scanner;

public class RunBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amount = 0;

        Checking c1 = new Checking();
        Savings s1 = new Savings();
        CreditCard cc1 = new CreditCard();

        c1.setBalance(100);
        s1.setBalance(100);
        cc1.setBalance(100);


        //prints account balances
        System.out.println("Making balance of " + c1.getBalance());
        System.out.println("Making deposit of " + s1.getBalance());
        System.out.println("Making deposit of " + cc1.getBalance());

        int rerun = 0;



        while(rerun != 10) {

            //prints bank name
            System.out.println("\nWelcome to Shahzad Banking Financial Services!");

            System.out.println("\nAccount Balances are... \nChecking Balance: " + c1.getBalance());
            System.out.println("Saving Balance: " + s1.getBalance());
            System.out.println("Credit Card Balance: " + cc1.getBalance());

            //prints command options
            System.out.println("""
            
                    OPTIONS:\s
                     1. Savings Deposit \t 2. Savings Withdrawal \t 3. Checking Deposit
                     4.Write a Check \t\t 5. Credit Card Payment  6. Make a Charge
                     7. Display Savings \t 8. Display Checking \t 9. Display Credit Card
                     10. Exit""");

            System.out.print("SELECT OPTION (#1-10): ");
            int option = scan.nextInt();

            //to check which command user is asking for
            switch (option) {
                case 1:
                    option = 1;
                    System.out.println("\nOPTION SELECTED: Savings Deposit");
                    System.out.print("How much would you like to deposit? ");
                    amount = scan.nextInt();

                    s1.makeDeposit(amount);
                    System.out.print("Making deposit of " + amount + ". " + "Deposit successful!\n");
                    break;
                case 2:
                    option = 2;
                    System.out.println("\nOPTION SELECTED: Savings Withdrawal");
                    System.out.print("How much would you like to withdrawal from Savings? ");
                    amount = scan.nextInt();

                    s1.doWithdraw(amount);
                    System.out.println("Making withdrawal of " + amount + ". " + "Withdrawal successful!\n"); //then print remaining balances ASK
                    break;
                case 3:
                    option = 3;
                    System.out.println("\nOPTION SELECTED: Checking Deposit");
                    System.out.print("How much would you like to deposit? ");
                    amount = scan.nextInt();

                    c1.makeDeposit(amount);
                    System.out.println("Making deposit of " + amount + ". " + "Deposit successful!\n"); //then print remaining balances ASK
                    break;
                case 4:
                    option = 4;
                    System.out.println("\nOPTION SELECTED: Write a Check");
                    System.out.print("Enter check number:");
                    int checkNumber = scan.nextInt();
                    System.out.print("Enter check amount: ");
                    amount = scan.nextDouble();

                    c1.writeCheck(checkNumber, amount);
                    System.out.println("Writing check " + checkNumber + " of " + amount + ". " + "Check successful!\n");
                    break;
                case 5:
                    option = 5;
                    System.out.println("\nOPTION SELECTED: Credit Card Payment");
                    System.out.print("How much would you like to pay? ");
                    amount = scan.nextInt();

                    cc1.makePayment(amount);
                    System.out.println("Making payment of " + amount + ". " + "Payment successful!\n");
                    break;
                case 6:
                    option = 6;
                    System.out.println("\nOPTION SELECTED: Make a Charge");
                    System.out.print("Enter what the purchase was: ");
                    String s = scan.next();
                    System.out.print("Enter Credit Card Charge: ");
                    amount = scan.nextInt();

                    cc1.debitCharge(s, amount);
                    System.out.println("Making charge of " + amount + " for " + s + ". " + "Charge Successful!\n");
                    break;
                case 7:
                    option = 7;
                    System.out.println("\nOPTION SELECTED: Display Savings");
                    s1.display();
                    break;
                case 8:
                    option = 8;
                    System.out.println("\nOPTION SELECTED: Display Checking");
                    c1.display();
                    break;
                case 9:
                    option = 9;
                    System.out.println("\nOPTION SELECTED: Display Credit Card");
                    cc1.display();
                    break;
            }

            if(option == 10)
            {
                    System.out.println("\nOPTION SELECTED: Exit");
                    System.out.println("Thank you for visiting Shahzad Banking Financial Services! Goodbye!\n");
                    break;
            }

        }



    }

    //overloading example
    /*public void setName(String n)
    {


       String name;
        name= n;
    }

    public void setName(double v)
    {


        String name;
        name= n;
    } */

}