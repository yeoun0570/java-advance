package lambda.day02.innerclass2;

public class A {
  //A클래스(바깥 클래스)의 인스턴스 필드와 메서드
  int field1;
  void method1(){
    System.out.println("A의 메서드1");
  }
  String field3 = "A field 값";

  //A클래스(바깥 클래스)의 정적필드와 메서드
  static int filed2;
  static void method2(){}
  
  //인스턴스 멤버 클래스
  class B{
    String field = "B의 field";

    void method() {
      /*//A클래스의 인스턴스 필드와 메서드 사용
      field1 = 1;
      method1();
      //A클래스의 정적 필드와 메서드 사용
      filed2 = 2;
      method2();*/
      System.out.println("B method");
    }
    //자기자신(B클래스)는 this로 호출하면됨
    void print() {
      System.out.println(this.field);
      this.method();

      //바깥 클래스의 객체 값을 호출하는 법
      System.out.println(A.this.field1 + " " + A.this.field3);
      A.this.method1();
    }

    //A의 인스턴스 메서드
    void useB() {
      B b = new B();
      b.print(); //A와 B의 값 모두 출력할 것이다
      //B를 private로 제한하면 출력되는 값만 확인 가능하고 안쪽은 확인 불가능 할 것이다
    }
  }

  static class C{

    void method() {
      //A클래스의 인스턴스 필드와 메서드 사용
      //field1 = 1;
      //method1();
      //A클래스의 정적 필드와 메서드 사용
      filed2 = 2;
      method2();
    }
  }

}
