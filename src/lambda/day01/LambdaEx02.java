package lambda.day01;
/*
* 1. 두 개의 정수를 받아 정수를 반환하는 단일메서드 'operate'가 있는
*    함수형 인터페이스 MathOperation을 정의
* 2. 두 개의 정수 a, b를 더하는 람다표현식을 생성 (a,b)->a+b
* 3. 람다 표현식을 사용하여 함수형 인터페이스의 인스턴스를 생성하고
*    operate()호출해서 두 숫자의 합을 구한다.
* */
public class LambdaEx02 {
  //1번 수행
  @FunctionalInterface
  interface MathOperation{
    int operate(int a, int b);
  }

  @FunctionalInterface
  interface StringOperation{
    int getStringLength(String string);
  }

  @FunctionalInterface
  interface ArrayOperation{
    int calculateSum(int[] nubmers);
  }


  public static void main(String[] args) {
    //2번 수행
    MathOperation addition = (a,b)->a+b;

    //3번 수행
    int result = addition.operate(5,3);
    System.out.println("Result = " + result);

    System.out.println("=======================");

    //문자열을 받아 그 길이를 반환하는 람다 표현식을 작성하세요
    //인터페이스의 이름 : StringOperation
    StringOperation length = str -> str.length();
    int result1 = length.getStringLength("Hello Lambda!");
    System.out.println("Length = " + result1);
    
    //정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식 작성
    //인터페스명 : ArrayOperation
    ArrayOperation evenSum = numbers -> {
      int sum = 0;
      for(int num : numbers) {
        if(num % 2 ==0){
          sum += num;
        }
      }
      return sum;
    };

    int[] array = {1,2,3,4,5,6,7,8,9,10};
    int result2 = evenSum.calculateSum(array);
    System.out.println("Result = " + result2);
    
  }

}
