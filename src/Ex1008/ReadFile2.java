package Ex1008;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\SelfStudyJava\\java_exercise_main\\testtxt");
        char[] buffer = new char[100];

        while (true) {
            int readNum = reader.read(buffer);
            if (readNum == -1) {
                break;
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(buffer[i]);
            }

        }
        reader.close();
    }


}

