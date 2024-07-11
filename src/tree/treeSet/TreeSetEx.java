package tree.treeSet;

import java.net.SocketTimeoutException;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

  public static void main(String[] args) {

    //랜덤한 학생 점수를 TreeSet 구조에 저장 관리해보자
    TreeSet<Integer> scores = new TreeSet<>();

    //학생 점수를 저장함과 동시에 정렬도 완성된다
    scores.add(88); //head
    scores.add(98); //head.right
    scores.add(75); //head.left
    scores.add(95); //head.right.left
    scores.add(80); //head.left.right
    scores.add(60); //head.left.left
    
    //정렬된 점수를 하나씩 가져오기 enhanced for 이용하여 출력
    for(Integer score : scores) {
      System.out.print(score + " " );
    }

    System.out.println();
    System.out.println("==============================");

    //특정 점수를 가져오기
    System.out.println("최저 점수 : " + scores.first()); //first() 사용
    System.out.println("최고 점수 : " + scores.last()); //last() 사용
    System.out.println("95점 아래 점수 : " + scores.lower(95)); //lower() 에 조건 넣어서 뽑기
    System.out.println("95점 위의 점수 : " + scores.higher(95)); //higher() 에 조건 넣어서 뽑기
    System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95)); //floor() 에 조건 넣어서 뽑기
    System.out.println("87점 이거나 바로 위의 점수 : " + scores.ceiling(87)); //ceiling() 에 조건 넣어서 뽑기

    System.out.println("==============================");

    //desc (내림차순) 정렬
    NavigableSet<Integer> descScores = scores.descendingSet();
    for(Integer score : descScores) {
      System.out.print(score + " " );
    }

    System.out.println();
    System.out.println("==============================");

    //범위 검색
    //tailSet()으로 data보다 높은 값을 뽑는데 true면 포함, 아니면 미포함해서 뽑는다
    NavigableSet<Integer> rangeScores = scores.tailSet(80, true);
    for(Integer score : rangeScores) {
      System.out.print(score + " " );
    }

    System.out.println();
    System.out.println("==============================");

    //subSet()은 범위를 직접 지정하여 출력
    NavigableSet<Integer> subScores = scores.subSet(80, true, 95, false);
    for(Integer score : subScores) {
      System.out.print(score + " " );
    }


  }
}
