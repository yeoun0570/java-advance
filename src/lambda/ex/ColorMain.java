/*
package lambda.ex;

import java.util.function.BiFunction;
import lombok.Getter;
import lombok.Setter;
import java.util.function.Function;

@Getter
@Setter
class Color {

  private int red;
  private int green;
  private int blue;

  public Color(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

}

public class ColorMain {

  public static void main(String[] args) {
    BiFunction<Integer, Integer, Function<Integer, Color>> colorConstructor = (red, green) -> blue -> new Color((red,green,blue);
    Color color = colorConstructor.apply(255, 128).apply(64);

    System.out.println(color.getRed());
    System.out.println(color.getGreen());
    System.out.println(color.getBlue());
  }

}*/
