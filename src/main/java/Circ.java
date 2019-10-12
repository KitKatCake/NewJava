public class Circ implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }

    @Override
    public double area() {
        return (double)((pi*radius*radius)/2);
    }

    double pi = 3.14;
    int radius;

    //constructor
    Circ(int radius)
    {

        this.radius = radius;
    }
}
