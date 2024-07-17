package dataIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriterEx01 {

  public static void main(String[] args) {
    try {
      FileOutputStream fs = new FileOutputStream("C://Temp/data.txt");
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fs));

      bw.write("Hello java.io.Writer!");
      bw.newLine();
      bw.write("반가워 친하게 지내자!");
      bw.close();
      fs.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
