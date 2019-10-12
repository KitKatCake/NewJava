public class Circle extends AbstractShape {
    double pi = 3.14;
    int radius;
    @Override
    public double area() {
        return (double)((pi*radius*radius)/2);
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }
    Circle(int radius, String name)
    {

        super(name);
        this.radius = radius;
    }
}
