public class Main2 {
    public static void main(String[] args) {

//        Pear pear = new Pear("梨", 2.30f, 8.0f);
//
//        System.out.println("水果的名字: " + pear.getName() + "\n水果的重量: " + pear.getWeight() + "\n水果的价格: " + pear.getPrice());
//
//        System.out.println("---------------------------------------");
//
//        Apple apple = new Apple("苹果", 2.45f, 6.3f);
//
//        System.out.println("水果的名字: " + apple.getName() + "\n水果的重量: " + apple.getWeight() + "\n水果的价格: " + apple.getPrice());

//        Base b = new Derived();
//
//        b.fun();

        //Derived d = new Derived();


//        AbstractShape rect = new Rectangle(2,3, "Rectangle");
//        System.out.println("Area of rectangle: " + rect.area());
//        rect.moveTo(1,2);
//
//        System.out.println(" ");
//
//        // creating the Objects of circle class
//        AbstractShape circle = new Circle(2, "Cicle");
//        System.out.println("Area of circle: " + circle.area());
//        circle.moveTo(2,4);


        Shape rect = new Rect(2,3);
        System.out.println("Area of rectangle: " + rect.area());

        // creating the Objects of circle class
        Shape circle = new Circ(2);
        System.out.println("Area of circle: " + circle.area());


    }
}
