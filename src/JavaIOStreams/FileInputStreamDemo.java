package JavaIOStreams;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {

        try (FileInputStream fis =
                     new FileInputStream("C:/Users/Sunil/Desktop/OOPS/Text.txt")) {

            byte b[] = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
            System.out.println(str);
        }
    }
}
