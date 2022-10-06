package Ex1008;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//실습6 한바이트 읽기
//char readOneByte(String filename)
//지정한 파일의 맨 앞 한byte를 읽어오는 method를 만들어 보세요
public class ReadFile {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\SelfStudyJava\\java_exercise_main\\testtxt");


            int data = reader.read();
            if(data == -1){
            }
            System.out.println((char)data);

        reader.close();
    }
}
