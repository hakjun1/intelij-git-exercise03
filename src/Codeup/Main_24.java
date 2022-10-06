package Codeup;

import java.util.Scanner;
//StringBuffer은 char 배열이 생성된다
//그래서 문자 하나 하나를 배열로 저장한다
//배열을 확인할때는 참조변수.charAt(num)으로 확인한다
public class Main_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer num = new StringBuffer(sc.nextLine());
        for (int i = 0; i < num.length(); i++) {
            System.out.println("\'"+num.charAt(i)+"\'");
        }
    }
}
