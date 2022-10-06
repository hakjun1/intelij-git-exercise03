package Ex1006;

import java.util.HashSet;
import java.util.Set;

public class RandomNumber {
    public String generate(){
        //////////// 알파벳 랜덤 생성
        int rannum = (int) (Math.random() * 26);
        char ch = (char) (rannum + 65);
        return Character.toString(ch); //알파벳을 문자형으로 리턴
        ////////////
    }

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();//generate 사용
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            set.add(randomNumber.generate());
        }
        System.out.println(set);
    }
}
