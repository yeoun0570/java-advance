package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class ParseEmployeeEx {

  public static void main(String[] args) throws IOException {
    //파일로부터 employee.json 읽어오기
    BufferedReader br = new BufferedReader(new FileReader("C://Temp/employee.json", StandardCharsets.UTF_8));

    String json = br.readLine();
    br.close();
    
    //JSON 파싱
    JSONObject root = new JSONObject(json);

    System.out.println(root.getString("id"));

    //객체 속성 정보 읽기
    JSONObject phone = root.getJSONObject("phone"); //root의 키 중 phone을 객체로 생성
    System.out.println(phone.getString("home")); //phone의 키 값 home을 출력

    //배열 속성 정보 읽기
    JSONArray skill = root.getJSONArray("skill"); //root의 키 값 skill을 객체로 생성
    for(int i = 0; i < skill.length(); i++) { //skill의 인덱스 번호 하나씩 출력
      System.out.println(skill.get(i));
    }

  }

}
