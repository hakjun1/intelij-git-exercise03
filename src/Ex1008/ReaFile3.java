package Ex1008;

import java.io.File;
import java.io.FileNotFoundException;

public class ReaFile3 {
    public static void main(String[] args) throws FileNotFoundException {

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
/*"C:\Program Files\Java\jdk-11.0.16\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.2\lib\idea_rt.jar=8157:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.2\bin" -Dfile.encoding=UTF-8 -classpath C:\SelfStudyJava\java_exercise_main\out\production\java_exercise_main Ex1008.ReaFile3
.\.git
.\.idea
.\java_exercise_main.iml
.\out
.\src
.\testtxt

종료 코드 0(으)로 완료된 프로세스*/
