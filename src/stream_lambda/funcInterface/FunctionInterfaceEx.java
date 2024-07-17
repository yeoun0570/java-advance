package stream_lambda.funcInterface;

/* Supplier<T> 형태
@FunctionalInterface
public interface Supplier<T> {
  T get();
}*/

/* Consumer<T> 형태
@FunctionalInterface
public interface Consumer<T> {
  void accept(T t);

  default Consumer<T> andThen(Consumer<? super T> after){
    Object.requiredonNull(after);
    return (T t) -> {accept(t); after.accept(t);
  };

}*/

//Function<T,R> 과 Predicate<T>는 ctrl + enter로 직접 들어가서 확인

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceEx {

  public static void main(String[] args) {

    Supplier<String> supplier = () -> "Hello Supplier!";
    System.out.println(supplier.get());

    System.out.println("=============================");

    Consumer<String> consumer = (str -> System.out.println(str.split(" ")[0]));
    consumer.andThen(System.out::println).accept("Hello Consumer!");

    System.out.println("=============================");

    Function<String, Integer> function = str -> str.length();
    //Function<String, Integer> function = String::length; //위와 동일
    System.out.println(function.apply("Hello Function Interface!"));

    System.out.println("=============================");

    Predicate<String> predicate = (str -> str.equals("Hello Predicate!"));
    System.out.println(predicate.test("Predicate"));

  }
}
