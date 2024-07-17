package stream_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalAggregateEx {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    /*double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
    System.out.println(avg);*/

    //1.isPresent()
    OptionalDouble optional1 = list.stream().mapToInt(Integer::intValue).average();

    if(optional1.isPresent()) {
      System.out.println(optional1.getAsDouble());
    } else {
      System.out.println("0.0");
    }

    //2.orElse()
    double avg = list.stream().mapToInt(Integer :: intValue).average().orElse(0.1);
    System.out.println(avg);

    //3.ifPresent()
    list.stream().mapToInt(Integer :: intValue).average().ifPresent(avg1 -> System.out.println(avg1));
    list.stream().mapToInt(Integer :: intValue).average().ifPresent(System.out::println); //위와 동일


  }
}
