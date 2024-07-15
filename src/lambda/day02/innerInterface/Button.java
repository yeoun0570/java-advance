package lambda.day02.innerInterface;

public class Button {

  public static interface ClickListner {
    void onClick();
  }

  //setter 메서드를 이용하여 ClickLister 구현 객체를 전달(injection)
  private ClickListner clickListner;

  public void setClickListner(ClickListner clickListner) {
      this.clickListner = clickListner;
  }

  //버튼이 클릭되었을 때, 실행할 메서드
  public void click(){
    this.clickListner.onClick();
  }

}
