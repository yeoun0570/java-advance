package list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

  public static void main(String[] args) {
    Queue<Integer> queue_int = new LinkedList<Integer>(); //Integer형 큐를 만드는 방법
    Queue<String> queue_string = new LinkedList<String>(); //String형 큐를 만드는 방법

    //Queue 추가
    queue_int.add(1);
    queue_int.offer(2);
    queue_int.offer(3);
    System.out.println(queue_int);

    //Queue 삭제
    queue_int.poll();
    System.out.println(queue_int);
    queue_int.remove();
    System.out.println(queue_int);

    //없는 값을 삭제했을 경우
    boolean result1 = queue_int.remove(2);
    System.out.println(result1);
    Integer result2 = queue_int.poll();
    System.out.println(result2);

  }

}
