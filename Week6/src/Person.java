public class Person {
    private int id;
    private String firstNAme;
    private String lastName;
    private int age;

    public Person(int id , int age , String firstNAme , String  lastName)
    {
        this.id = id;
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstNAme , String lastName)
    {
        this(0 , 0 , firstNAme , lastName);
    }

    public Person(int id)
    {
        this.id = id;
    }

    public Person()
    {
        id++;
    }
}
