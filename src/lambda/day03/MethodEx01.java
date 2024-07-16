package lambda.day03;

public class MethodEx01 {

  public static void main(String[] args) {

    Person1 user = new Person1();

    //사람의 이름 비교하기 위해 string 클래스의 인스턴스 메서드 compareToIgnoreCase() 메서드를 참조하여 사용
    //메서드 참조
    user.ordering(String :: compareToIgnoreCase);
    user.ordering((name1, name2) -> name1.compareToIgnoreCase(name2)); //위를 풀어쓴것
    
  }
}
