package collectionex.board.board;

import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
    //Board는 게시물 1개를 의미한다.
    //boardList는 여러개의 게시물을 저장하는 저장소
    List<Board> boardList = new ArrayList<Board>();

    boardList.add(new Board("맛있는 점심1", "윤여운1", "내일은 뭐 먹지?"));
    boardList.add(new Board("맛있는 점심2", "윤여운2", "내일은 뭐 먹지?"));
    boardList.add(new Board("맛있는 점심3", "윤여운3", "내일은 뭐 먹지?"));
    boardList.add(new Board("맛있는 점심4", "윤여운4", "내일은 뭐 먹지?"));
    boardList.add(new Board("맛있는 점심5", "윤여운5", "내일은 뭐 먹지?"));

    int boardsize = boardList.size();
    System.out.println(boardsize);

    System.out.println("======================================");

    //특정 인덱스를 지정하여 객체 가져오기
    Board board = boardList.get(2); //맛있는 점심3
    System.out.println(board.getSubject() + "\t" + board.getWriter() + "\t" + board.getContent());

    System.out.println("======================================");

    //boardList에 있는 모든 게시글 출력하기
    //방법1 : 인덱스 이용하기
    for(int i = 0; i <boardList.size(); i++) {
      Board board1 = boardList.get(i);
      System.out.println(board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());
    }

    System.out.println("======================================");

    //방법2 : 향상된 for 이용하기
    for(Board b : boardList) {
      System.out.println(b.getSubject() + "\t" + b.getWriter() + "\t" + b.getContent());
    }

  }

}
