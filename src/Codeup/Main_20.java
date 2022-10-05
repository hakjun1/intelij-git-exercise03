package Codeup;

import java.util.Scanner;

public class Main_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.printf("%d%d",a,b);
    }
}
