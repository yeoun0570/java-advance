package compare.Book;

import java.util.ArrayList;
import java.util.Collections;

public class BookComparableEx {

  public static void main(String[] args) {
    ArrayList<Book> booklist = new ArrayList<Book>();

    booklist.add(new Book("세이노의 가르침", "세이토", "화이트혁명", 2001));
    booklist.add(new Book("호모데우스", "유발 하라리", "민음사", 2004));
    booklist.add(new Book("호모데우스", "유발 하라리", "민음사", 2014));
    booklist.add(new Book("불안", "알랭 드 보통", "은행나무", 1999));
    booklist.add(new Book("코스모스", "칼세이건", "사이언스북",2007));
    booklist.add(new Book("코스모스", "칼세이건", "사이언스북",2009));
    booklist.add(new Book("동물농장", "조지오웰", "민음사",1989));
    booklist.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리",2003));
    booklist.add(new Book("정의란 무엇인가", "마이클샌델", "와이즈베리",2000));
    booklist.add(new Book("사피엔스", "유발 하라리", "김영사",2010));
    booklist.add(new Book("역사의 쓸모", "최태성", "다산북스",2020));
    booklist.add(new Book("역사의 쓸모", "최태성", "다산북스",2020));

    Collections.sort(booklist);
    for(int i = 0; i < booklist.size(); i++) {
      System.out.println(booklist.get(i).getSubject() + "\t" + booklist.get(i).getYear());
    }
  }
}
