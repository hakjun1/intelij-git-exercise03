package day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PopulationStatistics {
    public void readByChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);//파일을 읽어와야한다
        //파일을 읽지 않는다. read라는 명령어를 썻을때 파일을 읽어오기 시작한다
        String fileContents = "";//100만글자까지 읽기
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileReader);//구조가 이해안갈때 sout로 찍어봐야한다
            //while조건문찍어보면 속도면에서 100만개 밖에 안됬는데 비효율적이라는것을 알수있다
            //이렇게하면 한바이트씩옮겨 모래 한알씩 옮기는 느낌이다

        }
    }
        public List<PopulationMove> readByLine (String filename) throws IOException {
            //모래를 삽으로 푼다
            BufferedReader reader = new BufferedReader(new FileReader(filename));//readByLine에서 file를 넘겼으므로
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
                PopulationMove pm = parse(str);//3교시 추가
                pml.add(pm);
            }
            reader.close();
            return pml;
        }

        public void readByLine2 (String filename) {
            try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }   //실습 1 한줄의 데이터를 받아서 populationmove를 만들어라
            public PopulationMove parse(String data){
            //String data = "50,130,62000,2021,12,20,26,350.............. csv = 컴마 세퍼레이트 밸류 ,로 나뉜것
                String[] splittedLine = data.split(","); // 스플릿에 대해 설명
                return new PopulationMove(splittedLine[6],splittedLine[0]);//오버로딩 해야함**중요 전입to 전출 from
            }

            public void createAFile(String filename) {
                File file = new File(filename);
                try {
                    file.createNewFile();//여기까지해야 파일이 만들어짐
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public static void main (String[]args) throws IOException {
                String address = "C:\\Users\\임학준\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
                PopulationStatistics populationStatistics = new PopulationStatistics();
//                //populationStatistics.readByLine(address);
//                List<PopulationMove> pml = populationStatistics.readByLine(address);
//                System.out.println(pml.size());
//                for(PopulationMove pm:pml){
//                    System.out.printf("전입:%s, 전출:%s",pm.getFromSido(),pm.getToSido());
//                }
//                System.out.println(pml.size());
//            }

                //파일만들기
                populationStatistics.createAFile("from_to");













////        char c = (char)fileReader.read(); //char c 로 했을때 에러가나는이유
//        System.out.println(c);
//        char c2 = (char)fileReader.read(); //char c 로 했을때 에러가나는이유
//        System.out.println(c2);//대용량 파일을 읽을때는 읽는 명령어를 썻을때 파일의 앞부분만 조금읽는다//전체로딩이 아님

    }

