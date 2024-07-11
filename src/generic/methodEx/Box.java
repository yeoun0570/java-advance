package generic.methodEx;

public class Box <T> {
  private T type;

  public T get() { //제네릭 메서드 get
    return this.type;
  }

  public void set(T type) { //제네릭 메서드 collectionex.board.set
    this.type = type;
  }

}
