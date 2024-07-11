package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

  public static void main(String[] args) {

    //Map 컬렉션 생성 map
    Map<Integer, String> map = new HashMap<Integer, String>();

    //객체 저장
    map.put(1,"김미란");
    map.put(2,"최미란");
    map.put(3,"박미란");
    map.put(4,"이미란");
    map.put(5,"고미란");
    map.put(6,"고미란");
    System.out.println(map.size());

    System.out.println("==================");

    //키를 이용하여 값을 가져오기
    Integer key = 1;
    String value = map.get(1);
    System.out.println(value);

    System.out.println("==================");

    //key set 컬렉션을 이용하여 반복자를 통해 키와 값을 가져오기
    Set<Integer> keyset = map.keySet();
    Iterator<Integer> keyIterator = keyset.iterator();

    while(keyIterator.hasNext()){
      Integer key1 = keyIterator.next();
      String value1 = map.get(key1);
      System.out.println("key: " + key1 + "\t" + "value: " + value1);
    }

    //삭제하기
    map.remove(1);
    map.remove(2,"최미란");

    System.out.println("==================");
    
    //엔트리 set 컬렉션으로 반복해셔 키와 값을 가져오기
    Set<Entry<Integer, String>> entrySet = map.entrySet();
    Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
    while(entryIterator.hasNext()){
      Entry<Integer,String> entry = entryIterator.next();
      Integer key2 = entry.getKey();
      String value2 = entry.getValue();
      System.out.println("key: " + key2 + "\t" + "value: " + value2);
    }

  }
}
