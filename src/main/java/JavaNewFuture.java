import java.util.Optional;

public class JavaNewFuture {
    public static void main(String[] args) {
        String str = "hello";

        Optional<String> optional = Optional.ofNullable(str);

        optional.ifPresent(s1 -> System.out.println(s1));



    }
}
