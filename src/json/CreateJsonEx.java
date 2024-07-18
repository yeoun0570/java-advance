package json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

  public static void main(String[] args) throws IOException {
    //1.json 객체 생성
    JSONObject root = new JSONObject();

    //String 속성 추가(json은 엔트리 데이터를 가지고 있어서 map 방식으로 추가해준다.)
    root.put("id", "ssg001");
    root.put("name", "신세계");
    root.put("dept", "IT-Develop");
    root.put("job", "developer");

    //객체 속성 추가
    JSONObject phone = new JSONObject();
    phone.put("home", "02-2345-8989");
    phone.put("handphone1", "010-4454-8898");
    phone.put("handphone2", "010-4454-8898");
    root.put("phone", phone); //value로 넣은 phone은 phone객체의 주소값이 담겨져있다.

    //배열 객체 속성 추가
    JSONArray skill = new JSONArray();
    skill.put("Java");
    skill.put("C,C#");
    skill.put("Python");
    skill.put("JSP&Servlet");
    skill.put("Spring&SpringBoot");
    //skill.put("id", "111"); //순서의 주소값만 저장 가능
    root.put("skill", skill);

    //JSON 객체
    String jsonValue = root.toString();

    //출력
    System.out.println(jsonValue);
    //System.out.println(root); //위와 출력결과 동일

    //파일로 저장
    Writer jsonWriter = new FileWriter("C://Temp/employee.json", Charset.forName("UTF-8"));
    jsonWriter.write(jsonValue);
    jsonWriter.flush();
    jsonWriter.close();
  }
}
