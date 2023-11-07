public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Omer" , 2000);

        account1.Add(1000);
        System.out.println(account1.GetBalance());

        account1.SetOwnerName("25");
        System.out.println(account1.GetOwnerName());

        account1.Withdraw(1000);
    }
}