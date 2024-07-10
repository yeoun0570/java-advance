package generic.methodEx;

import generic.classEx.Doll;

public class GenericBoxEx {

  public static void main(String[] args) {
    Box<Integer> box1 = boxing(100);
    int value = box1.get();
    System.out.println(value);

    //"포켓몬 포토카드" 박싱하여 포장해주세요
    Box<String> box2 = boxing("포켓몬 포토카드");
    //상자에서 포켓몬 포토카드를 꺼내주세요
    String pokemonPhotoCard = box2.get();
    System.out.println(pokemonPhotoCard);
    
    //box3에 인형 미미를 포장해주세요
    Box<Doll> box3 = boxing(new Doll());
    //상자에서 미미인형을 꺼내서 이름과 제조업체를 확인하세요
    System.out.println(box3.get().name);
    System.out.println(box3.get().company);

  }

  public static <T> Box<T> boxing(T t) {
    Box<T> box = new Box<T>();
    box.set(t);
    return box;
  }

}
