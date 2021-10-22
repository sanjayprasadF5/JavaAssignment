package lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class question3 {
    public static void main(String[] args) {
        Consumer print=System.out::println;
        print.accept("Hello Naruto");

        Supplier getRandom=java.lang.Math::random;
        print.accept(getRandom.get());

        String a="123";
        Predicate<String> stringEquals=a::equals;
        print.accept(stringEquals.test("123"));

    }
}