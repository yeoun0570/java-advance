package lambda.day02;

public class ButtonEx {

  public static void main(String[] args) {
    Button btn = new Button();

    //버튼을 누를 때마다 출력될 메서드 작성
    btn.setClickListener(
        () -> {
          System.out.println("버튼이 클릭되었습니다.");
        }
    );

    //버튼 클릭
    btn.click();
    btn.click();

    Button cancelBtn = new Button();
    cancelBtn.setClickListener(
        () -> {
          System.out.println("Cancel 버튼이 클릭되었습니다.");
        }
    );

    //버튼 클릭
    cancelBtn.click();
    cancelBtn.click();
  }

}