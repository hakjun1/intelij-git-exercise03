package Ex1007;

public class AlphabetCnt {
    public static void main(String[] args) {

        String s1 = "aabbccddefghijkkkkkllm";
        //String을 한글자씩 출력할 수 있어야 한다
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(s1.length() - 1));//마지막 출력 0부터 시작하기때문(-1)
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(i);

        }
    }

    public boolean isAlphabet(char ch) {
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            return true;
        }
        return false;
    }
}

