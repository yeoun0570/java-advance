package lambda.day02.innerclass1;

//로컬 클래스 : 생성자나 메서드 안에서 생성되는 클래스
public class CC {

  void useC() {

    class D {
      //인스턴스 필드
      int field1 = 10;            //final int
      static int field2 = 20;     //final int

      D() {
        System.out.println("D 생성자 실행");
      }
      
      void method1(int arg) {   //final int arg
        System.out.println("D method1 실행");
      }

      static void method2() {   //java 17부터
        System.out.println("D method2 static 실행");
      }

    }
    //로컬 객체 생성
    D d = new D();
    
    //로컬 객체의 인스턴스 필드와 메서드 사용
    System.out.println(d.field1);
    d.method1(1);
    System.out.println(D.field2);
    D.method2();

  }

}
