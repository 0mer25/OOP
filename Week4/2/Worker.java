public class Worker {

    private String name;
    private float salary;
    public static int counter = 0;

    public Worker()
    {
        counter++;
        System.out.println("Total worker count = " + counter);
    }

    public void SetSalary(float value)
    {
        if(value > 0)
            this.salary = value;
        else
            System.out.println("Salary amount must be greater than zero");
    }

    public void SetName(String value)
    {
        this.name = value;
    }
}
