package compare.Book2;

import java.util.Comparator;

public class DescYear implements Comparator<Book2> {

  @Override
  public int compare(Book2 o1, Book2 o2) {
    int result = (o1.getYear() - o2.getYear()) * (-1);
    return result;
  }
}
