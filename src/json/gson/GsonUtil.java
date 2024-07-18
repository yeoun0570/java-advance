package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class GsonUtil {

  private static Gson gson1 = new Gson();

  private static Gson gson2 = new GsonBuilder()
      .disableHtmlEscaping() //HTML 문자를 유니코드 이스케이프 처리한다. GsonBuilder를 통해 생성된 객체가 HTML문자를 그대로 전달하겠다.
      .setPrettyPrinting()   //Json 문자열을 가독성 좋게 출력하게 하는 옵션
      .serializeNulls()      //기본적으로 Gson은 null 필드를 생략하지만, 해당 옵션을 사용하면 null로 인해 필드가 누락된 경우 발생할 수 있는 예외상황을 예방할 수 있다.
      .create();

  private static String getJsonData() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("data", "Test Data <신세계 자바 백엔드 개발자 과정>");
    return gson2.toJson(jsonObject); //jsonObject를 Json 문자열로 변환 (toJson())
  }

  private static UserInfo getData() {
    UserInfo userInfo = new UserInfo();
    userInfo.setNo(null);
    userInfo.setName("ssg");

    List<String> roles = new ArrayList<>();
    roles.add("Role-1");
    roles.add("Role-2");
    roles.add("Role-3");

    userInfo.setRoles(roles);

    return userInfo;
  }


  public static void main(String[] args) {
    //System.out.println(getJsonData());

    System.out.println(gson2.toJson(getData()));
  }

}
