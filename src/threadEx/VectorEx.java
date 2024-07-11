package threadEx;

import collectionex.board.board.Board;
import java.util.List;
import java.util.Vector;

public class VectorEx {

  public static void main(String[] args) { //main도 스레드 중 하나
    //Vector 컬렉션 생성
    List<Board> list = new Vector<>();

    //작업 스레드 객체 생성
    Thread threadA = new Thread() {
      @Override
      public void run() {
        //글(Board)을 1000개 추가
        for (int i = 1; i <= 1000; i++) {
          list.add(new Board("제목" + i, "윤여운" + i, "내용" + i));
        }
        super.run();
      }
    };

    Thread threadB = new Thread() {
      @Override
      public void run() {
        //글(Board)을 1000개 추가
        for (int i = 1001; i <= 2000; i++) {
          list.add(new Board("제목" + i, "윤여운" + i, "내용" + i));
        }
        super.run();
      }
    };

    //스레드 실행(작업 시작) --> 각자의 공간 안에서 자기 작업을 한다
    threadA.start();
    threadB.start();

    //현재 스레드의 개수 = 3개
    try{
      //작업자 A,B 작업이 모두 종료될 때까지 main작업자를 기다리게 하는것
      threadA.join();
      threadB.join();
    } catch (Exception e){

    }

    int size = list.size();
    System.out.println(size); //2000
    System.out.println("=======");
    for(Board board : list) {
      System.out.println(board.getSubject());
    }

  }

}
