public class Rectangle extends AbstractShape {
    int length, width;
    @Override
    public double area() {
        return (double)(length*width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    Rectangle(int length, int width, String name)
    {

        super(name);
        this.length = length;
        this.width = width;
    }
}
