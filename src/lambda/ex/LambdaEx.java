package lambda.ex;

import java.util.Arrays;
import java.util.List;

public class LambdaEx {

  public static void main(String[] args) {


    List<Integer> mmlists = Arrays.asList(1,2,3,4,5);
    mmlists.stream().forEach(m -> System.out.println(m));
    mmlists.forEach(System.out::println);

    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int total = 0;
    for(Integer odd : list) {
      if(odd % 2 == 1) {
        total += odd * odd;
      }
    }
    System.out.println("total = " + total);
    
    //stream 이용하여 홀수의 합을 구하는 방식
    total = list.stream().filter(d -> d % 2 == 1).reduce(0,Integer::sum);
    System.out.println(total);


    

  }

}
