package Ex1007;

import java.util.HashMap;

public class AlphabetCnt2 {

    public static boolean isAlphabet(char c){
        if(c>='A'&&c<='Z'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        String s1 = "aabbccddefghijkkkkkllm".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c = 'A';c <'Z';c++){
            alphabetMap.put(c, 0);
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isAlphabet = isAlphabet(c);
            if (isAlphabet) {
                //여기서만 개수를 센다

                alphabetMap.put(c,alphabetMap.get(c)+1);
            }
        }
        System.out.println(alphabetMap);
    }
}