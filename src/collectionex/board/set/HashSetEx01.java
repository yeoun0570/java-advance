package collectionex.board.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
    //HashSet 컬렉션 생성
    Set<String> set = new HashSet<>();

    //객체 저장
    set.add("신세계");
    set.add("신세계");
    System.out.println(set.size()); //1 --> 동등객체라서 size가 늘어나지 않는다
    set.add("신세계1");
    System.out.println(set.size()); //2 --> 동등객체가 아니라서 size가 늘어난다

    System.out.println("=======");

    Set<Member> memberlist = new HashSet<Member>();

    memberlist.add(new Member("ssg", 20));
    memberlist.add(new Member("ksg", 20));
    memberlist.add(new Member("lsg", 20));
    memberlist.add(new Member("msg", 20));
    System.out.println(memberlist.size());

    System.out.println("============================");

    //회원을 반복자 Iterator를 이용해서 가져오기
    Iterator<Member> iterator = memberlist.iterator();
    while(iterator.hasNext()) {
      //회원 한명 가져오기
      Member member = iterator.next();
      System.out.println(member.name + "\t" + member.age);
      if(member.name.equals("ksg")) iterator.remove(); //회원 탈퇴 (컬렉션에서 제거)
      if(member.name.equals("ssg")){ //회원 탈퇴 (컬렉션에서 제거)
        iterator.remove();
      }
    }


    System.out.println("============================");

    //회원을 반복자 enhanced for를 이용해서 가져오기
    for(Member member : memberlist) {
      System.out.println(member.name + "\t" + member.age);
      if(member.name.equals("lsg")){
        memberlist.remove(member);
      }
    }
  }

}
