package lambda.day01;

import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {

  public static void main(String[] args) {

    //List 컬렉션에 1~10까지 10개의 정수를 저장하고
    //컬렉션의 짝수의 합을 구하세요

    //Arrays.asList() : 파라미터에 넣은 값으로 ArrayList를 생성
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //stream().filter() : 구멍을 뚫어서 필터에 담는다
    //mapToInt() : 매핑해서 형변환을 하겠다
    //sum() : 전부 더하겠다
    int sumOfEvenNumbers = numbers.stream().filter(number -> number % 2 == 0)
        .mapToInt(Integer::intValue).sum();

    System.out.println(sumOfEvenNumbers);

  }
}