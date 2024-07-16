package lambda.day03;

//사용자로부터 두개의 정수를 받아서 데이터를 저장하고 있는 메서드 action() 메서드
//Calculable 타입을 전달 받아 Calculable 인터페이스의 calculate 메서드로
//데이터를 처리하는 메서드이다

//action을 이용하여 입력받은 두개의 정수를 더하기, 곱하기 연산을 하는 람다식
//그 결과를 바로 출력하여 확인

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class CalEx01 {

  public static void main(String[] args) {
    Person user = new Person();

    user.action(
        (x, y) -> {
          int result = x + y;
          return result;
        }
    );

    user.action((x, y) -> (x * y));

    user.action((x, y) -> sum(x, y)); //합을 구하는 sum을 import해옴

  }
}

/*  static Scanner sc = new Scanner(System.in);

  public static void action(Calculable calculable) {
    int x = sc.nextInt();
    int y = sc.nextInt();
    //x, y 데이터를 처리하는 데이터 처리 메서드에게 데이터를 보낸다.
    calculable.calculate(x, y);
  }

  public static String processData() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    return br.readLine();
  }

  public static void main(String[] args) {

    action((x,y) -> {
      int a = x + y;
      System.out.println(a);
    });

    action((x,y) -> {
      int b = x * y;
      System.out.println(b);
    });

  }

}*/
