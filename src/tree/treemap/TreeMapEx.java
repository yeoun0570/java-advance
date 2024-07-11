package tree.treemap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

  public static void main(String[] args) {
    TreeMap<String, Integer> treemap = new TreeMap<>();

    //엔트리 저장
    treemap.put("윤00", 90);
    treemap.put("최12", 80);
    treemap.put("김34", 95);
    treemap.put("이56", 70);
    treemap.put("구78", 83);
    treemap.put("황99", 93);

    //정렬된 엔트리 하나씩 가져오기
    Set<Entry<String, Integer>> entrySet = treemap.entrySet();
    for (Entry<String, Integer> student : entrySet) {
      System.out.println(student.getKey() + "----" + student.getValue());
    }

    System.out.println("=======================================");

    //특정 키 검색하여 값 가져오기
    Entry<String, Integer> entry = null;
    entry = treemap.firstEntry(); //첫번째 키값
    System.out.println(entry.getKey() + "----" + entry.getValue());
    entry = treemap.lastEntry(); //마지막 키값
    System.out.println(entry.getKey() + "----" + entry.getValue());
    entry = treemap.lowerEntry("윤여운6"); //바로 이전 키값
    System.out.println(entry.getKey() + "----" + entry.getValue());

    System.out.println("=======================================");

    //desc (내림차순) 정렬
    NavigableMap<String, Integer> descStudent = treemap.descendingMap();
    Set<Entry<String, Integer>> descScoresSet = descStudent.entrySet();
    for (Entry<String, Integer> student : descScoresSet) {
      System.out.println(student.getKey() + "----" + student.getValue());
    }

    System.out.println("=======================================");

    //범위 검색 가능함
    NavigableMap<String, Integer> substudent = treemap.subMap("윤", true, "이", false);
    for (
        Entry<String, Integer> submap : substudent.entrySet()) {
      System.out.print(submap.getKey() + "---" + submap.getValue());
    }
    System.out.println("\n");

  }

}
