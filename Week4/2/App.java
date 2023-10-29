public class App {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        worker1.SetSalary(-1);  // exception side
    }
}
