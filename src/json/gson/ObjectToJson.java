package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectToJson {

  private static Gson studentGson = new GsonBuilder()
                                        .disableHtmlEscaping().
                                        setPrettyPrinting().
                                        create();

  private static Student getData() {
    Student student = new Student(1, "yeoun");

    return student;
  }

  public static void main(String[] args) {

    String jsonStudent = studentGson.toJson(getData());

    System.out.println(studentGson.toJson(getData()));

    System.out.println("=====================");

    System.out.println(studentGson.toJson(getData().getId()));
    System.out.println(studentGson.toJson(getData().getName()));
  }
}
