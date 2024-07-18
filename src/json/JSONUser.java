package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUser {

  public static void main(String[] args) throws IOException {

    JSONObject user = new JSONObject();
    user.put("name", "yyu");
    user.put("age", 26);
    user.put("isMarried", false);

    JSONArray hobbies = new JSONArray();
    hobbies.put("Game");
    hobbies.put("Sleep");
    user.put("hobbies", hobbies);

    JSONObject address = new JSONObject();
    address.put("home", "CheolSan");
    address.put("Class", "Samsung");
    user.put("address", address);


    String userJava = user.toString();

    Writer userWriter = new FileWriter("C://Temp/user.json", Charset.forName("UTF-8"));

    userWriter.write(userJava);
    userWriter.flush();
    userWriter.close();

    BufferedReader br = new BufferedReader(new FileReader("C://Temp/user.json", StandardCharsets.UTF_8));

    String readUser = br.readLine();
    br.close();

    JSONObject getUser = new JSONObject(readUser);
    System.out.println(getUser.getString("name"));

    JSONArray getHobbies = getUser.getJSONArray("hobbies");
    for(int i = 0; i < getHobbies.length(); i++) {
      System.out.println(getHobbies.get(i));
    }

    JSONObject getAddress = getUser.getJSONObject("address");
    System.out.println(getAddress.getString("home"));


  }
}
