package generic.classEx;

//@Getter
//@Setter
public class Product <K,M> { //제네릭 타입의 클래스 Product
  private K kind;   //타입 파라미터로 받은 K를 kind 필드의 타입으로 사용하겠다.
  private M model;  //타입 파라미터로 받은 M을 model 필드의 타입으로 사용하겠다.

  public K getKind() {
    return kind;
  }

  public void setKind(K kind) {
    this.kind = kind;
  }

  public M getModel() {
    return model;
  }

  public void setModel(M model) {
    this.model = model;
  }
}
