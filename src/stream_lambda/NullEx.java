package stream_lambda;

import java.util.Optional;

public class NullEx {

  public static void main(String[] args) {
    /*String str = null;
    if(str == null) {
      System.out.println("폭탄 null");
    } else {
      System.out.println(str);
    }*/

    //Optional 클래스는 제네릭 타입을 사용하여 값의 타입을 지정한다.

    //1. 존재 여부에 따른 처리
    //String value = "Hello Optional!";
    String value = null;

    /*//1-1.Optional.of(value) --> Optional 객체 생성 한다.
    Optional<String> optionalS = Optional.of(value);

    //1-2.Optional의 객체의 값의 유무 확인
    if (optionalS.isPresent()) {
      System.out.println(optionalS.get());
    }

    optionalS.ifPresent(System.out::println); //위의 if문과 같은 의미*/
    
    //2.Null 처리 방법
    Optional<String> optionalS1 = Optional.ofNullable(value);
    
    //2-1.orElse를 사용해서 null인 경우 기본값 반환, null이 아닌경우 결과값 반환
    String result  = optionalS1.orElse("반갑습니다. null 처리 메시지 입니다.");
    System.out.println(result);

  }


}
