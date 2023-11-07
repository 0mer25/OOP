import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        worker1.name = "ABC";
        worker1.socialSecurityNumber = 1;
        worker1.wage = 100;
        worker1.workingHours = 20;

        worker1.DisplayInfo();
        worker1.DisplaySalary();

        System.out.print("Name : ");
        worker2.name = scanner.next();
        System.out.print("Security Number : ");
        worker2.socialSecurityNumber = scanner.nextInt();
        System.out.print("Wage : ");
        worker2.wage = scanner.nextFloat();
        System.out.print("Working Hours : ");
        worker2.workingHours = scanner.nextInt();

        worker2.DisplayInfo();
        worker2.DisplaySalary();;
    }
}