package compare.Book;

import lombok.AllArgsConstructor;
import lombok.Data;

//Book VO : 데이터 객체
@Data
@AllArgsConstructor
public class Book implements Comparable<Book> {

  private String subject;     // 책 제목
  private String writer;      // 지은이
  private String publisher;   // 출판사
  private int year;           // 출판년도

  //3. 책 제목 기준으로 사전순으로 정렬을 하되, 만약 책 제목이 동일하다면 출판년도로 오름차순 정렬
  @Override
  public int compareTo(Book o) {  // 내부에서 비교 처리 후, 비교 결과를 int형으로 리턴
    int result = this.getSubject().compareTo(o.getSubject());
    if (result == 0) {
      result = this.getYear() - o.getYear();
    }
    return result;
  }
}

