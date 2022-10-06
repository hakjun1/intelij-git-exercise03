package Codeup;

import java.util.Scanner;

public class Main_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("["+input/10000+"0000]");
        input %= 10000;
        System.out.println("["+input/1000+"000]");
        input %= 1000;
        System.out.println("["+input/100+"00]");
        input %= 100;
        System.out.println("["+input/10+"0]");
        input %= 10;
        System.out.println("["+input/1+"]");


    }
}
