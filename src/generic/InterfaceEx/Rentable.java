package generic.InterfaceEx;

//제네릭 타입의 인터페이스
public interface Rentable <P> {
  //다양한 대상을 렌트하기 위한 rent()메서드의 리턴 타입을 타입파라미터 P로 지정
  public P rent();

}
