public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;


    public void DisplayInfo()
    {
        System.out.println("Name : " + name + "\nSecurity Number : " + socialSecurityNumber);
    }

    public void DisplaySalary()
    {
        System.out.println("Salary : " + (wage * workingHours));
    }
}
