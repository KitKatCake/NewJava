public class Derived extends Base {
    @Override
    void fun() {
        System.out.println("Derived fun() called");
    }
    Derived(){
        System.out.println("Derived Constructor Called");
    }
}
