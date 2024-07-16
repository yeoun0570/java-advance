package lambda.day03;

/* Member 클래스는 id로 객체를 생성하는 생성자와
 * id, name으로 객체를 생성하는 생성자를 작성하고
 * 필드값을 확인하도록 toString() 오버라이딩 해주세요*/

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private String id;
  private String name;

  public Member(String id) {
    this.id = id;
  }
}
