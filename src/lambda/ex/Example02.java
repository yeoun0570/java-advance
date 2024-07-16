package lambda.ex;

@FunctionalInterface
interface Operator {
  public int apply(int x, int y);
}

public class Example02 {

  private static int[] scores = {90, 80, 60};

  public static int maxOrMin(Operator operator) {
    int result = scores[0];
    //scores에서 최대값 또는 최소값을 찾아 리턴하는 코드를 작성하세요

    for (int i = 0; i < scores.length; i++) {
        result = operator.apply(result, scores[i]);
    }

    return result;
  }

  public static void main(String[] args) {

    int max = maxOrMin((x,y) -> Math.max(x,y));
    int min = maxOrMin((x,y) -> Math.min(x,y));
    System.out.println(max);
    System.out.println(min);

  }

}
