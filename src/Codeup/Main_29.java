package Codeup;

import java.util.Scanner;
//String.format() = ()안의 함수를 0을 삭제하지않고 표현 Math.round()와 차이
//입력되는값의 범위가 float를 넘으므로 double을 사용함
public class Main_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        System.out.printf(String.format("%.011f",num));
    }
}
