package bytearrayconversion;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class bytearraystream {

	public static void main(String[] args) {
		byte[] array = {1, 2, 3, 4};
		String s = "Welcome to java";
      try {
        ByteArrayInputStream input = new ByteArrayInputStream(array);
        OutputStream out = new FileOutputStream("stringoutput.txt");
        OutputStream out1 = new FileOutputStream("bytearrayoutput.txt");
        byte[] dataBytes = input.readAllBytes();
        byte[] db = s.getBytes();
        out.write(db);
        out1.write(dataBytes);
        out.close();
        out1.close();
        input.close();
     }
      catch(Exception e) {
       e.getStackTrace();
      }

	}

}
