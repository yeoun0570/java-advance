package lambda.day02;

public class Button {
  
  //함수형 인터페이스 정의
  @FunctionalInterface
  public static interface ClickListener {
    void onClick();
  }

  private ClickListener clickListener;
  
  //메서드
  //버튼을 계속 모니터링 하다가 이벤트가 발생하면 해당 데이터를 저장
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {
    this.clickListener.onClick();
  }


}
