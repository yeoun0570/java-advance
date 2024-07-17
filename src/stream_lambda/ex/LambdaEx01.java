package stream_lambda.ex;

//함수형 인터페이스란? 함수를 변수처럼 선언해서 사용하는 개념
//코드를 간결하게 작성할 수 있다.
@FunctionalInterface
interface Func1{
  int max(int n1, int n2);
}
public class LambdaEx01 {

  public static void main(String[] args) {
    //익명 함수
        /*System.out.println(new Func1(){

          public int max(int n1, int n2){
            return n1 > n2 ? n1 : n2;
          }

        }.max(5,7));*/

        // 순수 함수 : 람다식으로 생성된 함수로써 함수형 인터페이스로만 선언이 가능하다.
        Func1 func1 = (int a, int b) -> a > b ? a : b; //위의 주석과 동일
        System.out.println(func1.max(3,5));

  }
}
