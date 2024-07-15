package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
  //1부터 10까지 정수 컬렉션을 stream을 이용해서 출력

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9,10);
    list = list.stream().filter(number -> number % 2 == 0).toList();
    list.forEach(System.out::println);

    System.out.println("=======================");

    //boxed() 메서드를 사용하여 IntStream을 Stream<Integer>
    List<Integer> list1 = IntStream.rangeClosed(1,10).filter(number -> number % 2 == 0).boxed().toList();
    list.forEach(System.out::println);

    System.out.println("=======================");

    //소문자로 시작하는 영문 과일 이름을 대문자로 시작하는 과일명으로 변경하기
    //리스트 컬렉션에 "apple, banana, orange, grape"을 stream으로 저장하고 출력하기
    List<String> fruits = Arrays.asList("apple, banana, orange, grape");
    fruits.stream().map(String::toUpperCase).forEach(System.out::println);
    fruits.forEach(System.out::println);

    System.out.println("=======================");

    //문장 스트림을 생성하고, 각 문장의 단어 수를 계산하는 기능
    //"\\s+"는 스페이스 라는 뜻
    List<String> sentence = Arrays.asList("This is a sentence", "Java Stream is awesome", "Let's count word");
    sentence.stream().mapToInt(sentence1 -> sentence1.split("\\s+").length).forEach(System.out::println);

  }

}
