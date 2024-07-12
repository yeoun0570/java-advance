package compare.Person;

import java.util.TreeSet;

public class PersonEx {

  public static void main(String[] args) {
    TreeSet<Person> people = new TreeSet<>(new PersonComparator());

    people.add(new Person("윤여운1", 10));
    people.add(new Person("윤여운2", 30));
    people.add(new Person("윤여운3", 20));
    people.add(new Person("윤여운4", 50));
    people.add(new Person("윤여운5", 40));
    people.add(new Person("윤여운6", 40));

    for(Person person : people) {
      System.out.println(person.getAge() + "\t" + person.getName());
    }
  }
}
