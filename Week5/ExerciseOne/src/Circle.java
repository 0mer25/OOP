public class Circle {
    private final double PI = 3.141519;
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void ComputeArea()
    {
        System.out.println("Circle area : " + (PI * radius * radius));
    }

}
