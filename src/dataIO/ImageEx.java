package dataIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageEx {

  public static void main(String[] args) throws IOException {
    String originalFileName = "C://Temp/짱구.png";
    String targetFileName = "C://Temp/짱구_copy+.png";

    InputStream is = new FileInputStream(originalFileName);
    OutputStream os = new FileOutputStream(targetFileName);

    /*byte[] buffer = new byte[1024];

    while (true) {
      int data = is.read(buffer);
      if (data == -1) {
        break;
      }
      os.write(buffer, 0, data);
    }*/
    is.transferTo(os); //java 9부터 지원
    os.flush();
    os.close();
    is.close();
    System.out.println("copy complete!");
  }
}
