package collectionex.board.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList와 LinkedList 객체 추가 성능 비교
public class DiffEx {

  public static void main(String[] args) {

    //ArrayList list1, LinkedList list2 객체 생성
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    //시작 시간과 끝 시간을 저장할 변수 선언
    long startTime;
    long endTime;

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      list1.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n","ArrayList 걸린 시간 : ", (endTime - startTime));

    System.out.println("==================================");

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      list2.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf("%-15s %8s ns \n","LinkedList 걸린 시간 : ", (endTime - startTime));

  }
}
