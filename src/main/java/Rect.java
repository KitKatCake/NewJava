public class Rect implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double)(length*width);
    }
    int length, width;

    // constructor
    Rect(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
}
