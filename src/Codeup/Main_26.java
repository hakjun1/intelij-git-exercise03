package Codeup;

import java.util.Scanner;

public class Main_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(":");

        if (input[1].equals("00")) {
            System.out.println("0");
        } else {
            System.out.println(input[1]);
        }


    }
}
