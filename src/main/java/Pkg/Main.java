package Pkg;

import javafx.util.Pair;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Printer printer = new DotMatrixPrinter();
//
//        printer.print();

        A a = new B();

        a.fun();

        Pair<Integer,String> pair = new Pair<Integer, String>(1,"a");

        System.out.println(pair.getKey()+":"+pair.getValue());

        Function<Integer,Double> half = c -> c / 2.0;

      //  System.out.println(half.apply(10));

//        half = half.andThen(c -> 3 * c);

        half = half.andThen(d -> 3 * d);

        System.out.println(half.apply(10));

        Function<Integer, Double> halff = cc -> cc / 2.0;

        try {

            // try to pass null as parameter
            halff = halff.andThen(null);
        }
        catch (Exception e) {
            System.out.println("Exception thrown "
                    + "while passing null: " + e);
        }

        Function<Integer, Double> halfe = ae -> ae / 2.0;

        // However treble the value given to half function
        halfe = halfe.compose(ae -> 3 * ae);

        // apply the function to get the result
        System.out.println(halfe.apply(5));

        Function i = Function.identity();

        System.out.println(i);



    }
}
