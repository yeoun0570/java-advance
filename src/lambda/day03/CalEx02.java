package lambda.day03;

public class CalEx02 {

  public static void main(String[] args) {
    Person user = new Person();
    //user는 컴퓨터의 덧셈기를 이용하여 두 수를 더하여 결과를 확인
    user.action(Computer :: adder);

    //user는 컴퓨터의 곱셈기를 이용하여 두 수를 곱하여 결과를 확인
    Computer com = new Computer();
    user.action(com :: multiply);

  }

}
