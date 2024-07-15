package lambda.day02.innerInterface;

public class ButtonEx {

  public static void main(String[] args) {

    Button okbtn = new Button();

    class OKListener implements Button.ClickListner {

      @Override
      public void onClick() {
        System.out.println("OK 버튼 클릭!");
      }
    }

    okbtn.setClickListner(new OKListener());
    okbtn.click();

    Button cancelbtn = new Button();

    class CancelListener implements Button.ClickListner {

      @Override
      public void onClick() {
        System.out.println("Cancel 버튼 클릭!");
      }
    }

    cancelbtn.setClickListner(new CancelListener());
    cancelbtn.click();

  }

}
