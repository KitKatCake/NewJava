public class JavaApplication {

    public strictfp double sum() {

        double num1 = 10e+10;

        double num2 = 6e+08;

        return num1 + num2;
    }

    public static strictfp void main(String[] args) {

//        DemoAbstractClass AC = new DemoAbstractClass() {
//            void display()
//            {
//                System.out.println("Hi.");
//            }
//        };
//        AC.display();
//        System.out.println("How are you?");
//
//      Interfc interfc = new Interfc() {
//          @Override
//          public Interfc display() {
//              System.out.println("这是匿名内部类");
//              return null;
//          }
//      }.display();

        JavaApplication jp = new JavaApplication();

        System.out.println(jp.sum());

        double f = 10e02;

        System.out.println((int)(f));




        //interfc.display();
    }
}
