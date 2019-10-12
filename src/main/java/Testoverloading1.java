import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Testoverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));

        var s = "Hello World!";

        System.out.println(s.getClass().toString());

        Integer a = 10;

        int b = a;

        System.out.println(b);

        System.out.println(a.getClass().toString());

        System.out.println(Adder.p);

        //System.out.println((int)(Math.random()*10));

       // Random rand = new Random(10);

        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        for (var val:arr){
            System.out.println(val);
        }
        Inter inter = new Inter() {
            @Override
            public void print() {
                System.out.println("这是一个匿名内部类!");
            }
        };

        inter.print();

       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程启动了");
            }
        }).start();


        */
//        new Thread(()->System.out.println("启动另一个线程")).start();


        /*
        ThreadDemo th = new ThreadDemo();

        th.start();


        RunnableDemo run = new RunnableDemo();

        Thread t = new Thread(run);

        t.start();


         */
        List<String> list = Arrays.asList("java","c","python","php","c++","c#");

//        list.stream().forEach((n)-> System.out.println(n));

     //   list.stream().forEach(System.out::println);

        Predicate<String> p1 = (n)->n.startsWith("c");

        Predicate<String> p2 = (n)->n.length()==3;

        list.stream().filter(p1).forEach(System.out::println);

        list.stream().filter(p2).forEach(System.out::println);


        List<Double> list2 = Arrays.asList(100.0,200.0,300.0);

        var p = list2.stream().map(n->n*0.2).reduce((sum,n)->sum+n).get();

        System.out.println(p);

        var ss = list2.stream().filter(n->n>=200).collect(Collectors.toList());

        for (var sval:ss){
            System.out.println(sval);
        }

        DoubleSummaryStatistics res = list2.stream().mapToDouble(n->n).summaryStatistics();

        System.out.println(res.getMax());

        System.out.println(res.getMin());





    }


}
