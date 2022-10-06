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
