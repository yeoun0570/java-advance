package lambda.day02.innerclass1;

//중첩클래스
public class A {

  //인스턴스 멤버 클래스
  class B {

    int field = 10;
    static int field2 = 20;

    B() {
      System.out.println("B 생성자 실행");
    }

    void method1() {
      System.out.println("B method1 실행");
    }

    static void method2() {
      System.out.println("B method2 실행");
    }


  }

  void userB() {
    //B객체 생성과 인스턴스 메서드 및 필드 사용
    B b = new B();
    System.out.println(b.field);
    b.method1();

    System.out.println(B.field2);
    B.method2();
  }

  //인스턴스 필드 값으로 B객체 대입
  B field = new B();

  //생성자
  A() {
    B b = new B();
  }

  //인스턴스 메서드
  void method() {
    B b = new B();
  }

}
