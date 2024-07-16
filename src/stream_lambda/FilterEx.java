package stream_lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {

  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("윤여운");
    list.add("윤여운");
    list.add("윤여운");
    list.add("김여운");
    list.add("박여운");
    list.add("박여운");

    //중복요소를 제거
    list.stream().distinct().forEach(yeoun -> System.out.println(yeoun));

    System.out.println("===============");

    list.stream().distinct().forEach(System.out::println);

    System.out.println("===============");

    list.stream().filter(yeoun -> yeoun.startsWith("박")).forEach(System.out::println);

    System.out.println("===============");

    list.stream().distinct().filter(yeoun -> yeoun.startsWith("박")).forEach(System.out::println);

  }
}
