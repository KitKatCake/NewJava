import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class lambda {
    public static void main(String[] args) {

        int[] intArray = {12,3,34,67,100,99};

        IntStream intStream  = IntStream.of(intArray);

        IntSummaryStatistics statistics = intStream.summaryStatistics();

        System.out.println("the max:" + statistics.getMax());
        System.out.println("the min:" + statistics.getMin());
        System.out.println("the average:" + statistics.getAverage());
        System.out.println("the sum:" + statistics.getSum());
        System.out.println("the count:" + statistics.getCount());
    }
}
