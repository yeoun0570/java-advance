package collectionex.board.board;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Board {

  private String subject;
  private String writer;
  private String content; //글 내용

}
