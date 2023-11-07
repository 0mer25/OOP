import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private int password = 1234;

    public Account(String name , double balance)
    {
        this.ownerName = name;
        this.balance = balance;
    }

    public void Add(double amount)
    {
        balance += amount;
    }
    public void Withdraw(double amount)
    {
        Scanner scanner = new Scanner(System.in);
        if(amount > balance)
        {
            System.out.println("You don't have that money :|");
            return;
        }
        int loginTry = 0;
        int x;
        while(true)
        {
            System.out.print("Please enter a 4-digit pass: ");
            x = scanner.nextInt();
            if(x == password)
            {
                System.out.println("Succesfully withdrawed");
                break;
            }
            else
            {
                System.out.println("Wrong Password! Try Again");
                loginTry++;
                if(loginTry == 3)
                {
                    System.out.println("Your account has been blocked, please try again later");
                    break;
                }
            }
        }
    }
    public double GetBalance()
    {
        return balance;
    }
    public void SetOwnerName(String name)
    {
        this.ownerName = name;
    }
    public String GetOwnerName()
    {
        return ownerName;
    }
}
