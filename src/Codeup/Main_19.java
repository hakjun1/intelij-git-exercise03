package Codeup;

import java.util.Scanner;

//split(" ")로 문자열을 자를수있다
//입력받는 동시에도 가능하고 저장후 끊어서 출력도 가능
public class Main_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split("\\.");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        System.out.printf("%04d.%02d.%02d",a,b,c);
    }


}
