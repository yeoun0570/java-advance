package dataIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteInputStreamEx01 {

  public static void main(String[] args) {
    try {
      InputStream inputStream1 = new FileInputStream("C://Temp/test.txt");

      while (true) {
        int data = inputStream1.read();
        if (data == -1) {
          break;
        }
        System.out.println(data);
      }
      inputStream1.close();
    } catch (FileNotFoundException e) {
      System.err.println("해당 경로에 파일이 존재하지 않습니다.");
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("================");

    try {
      InputStream inputStream2 = new FileInputStream("C://Temp/test2.txt");

      byte[] dataBytes = new byte[1024];

      while (true) {
        int data = inputStream2.read(dataBytes);
        if (data == -1) {
          break;
        }

        for (int i = 0; i < data; i++) {
          System.out.println(dataBytes[i]);
        }

      }
      inputStream2.close();
    } catch (FileNotFoundException e) {
      System.err.println("해당 경로에 파일이 존재하지 않습니다.");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
