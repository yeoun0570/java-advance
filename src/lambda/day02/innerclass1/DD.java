package lambda.day02.innerclass1;

public class DD {

  public void method3(int n) {
    //로컬 변수
    int var = 1;

    //로컬 클래스
    class E {

      void method4() {
        //로컬 변수
        System.out.println("n 값 = " + n);
        System.out.println("var 값 = " + var);

        //var = 2; //로컬 클래스에서는 로컬 변수의 값을 수정할 수 없다.

      }

    }

    //로컬 객체 생성
    E e = new E();
    e.method4();
    //e.method3();
    //var = 5; //로컬 클래스에서는 로컬 변수의 값을 수정할 수 없다.

  }

}
