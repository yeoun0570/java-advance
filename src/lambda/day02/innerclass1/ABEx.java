package lambda.day02.innerclass1;

public class ABEx {

  public static void main(String[] args) {
    //A객체 생성
    A a = new A();

    //B객체 생성
    A.B b = a.new B();

    a.userB();

  }

}
