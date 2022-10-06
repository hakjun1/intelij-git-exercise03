package Codeup;

import java.util.Scanner;
//String[] num = num[0] = split 전의 모든 문자열 저장
//num[1] = split 후의 문자열
public class Main_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split("\\.");
        System.out.println(num[0]);
        System.out.println(num[1]);

    }

}
