public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1 , 20 , "A" , "B");
        Person p2 = new Person("C" , "D");
        Person p3 = new Person(3);
        Person p4 = new Person();


        System.out.println("p1 -> \nId : " + p1.id + "\nAge : " + p1.age + "\nName : " + p1.firstNAme + "\nLastname : " + p1.lastName);
        System.out.println("------");
        System.out.println("p2 -> \nId : " + p2.id + "\nAge : " + p2.age + "\nName : " + p2.firstNAme + "\nLastname : " + p2.lastName);
        System.out.println("------");
        System.out.println("p3 -> \nId : " + p3.id + "\nAge : " + p3.age + "\nName : " + p3.firstNAme + "\nLastname : " + p3.lastName);
        System.out.println("------");
        System.out.println("p4 -> \nId : " + p4.id + "\nAge : " + p4.age + "\nName : " + p4.firstNAme + "\nLastname : " + p4.lastName);


    }
}